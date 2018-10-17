package de.abas.dpd.webservice.login;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.soap.SOAPException;

import org.apache.cxf.common.util.Base64Utility;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

import com.dpd.common.service.shipmentservice._3_2.ShipmentService32;
import com.dpd.common.service.shipmentservice._3_2.ShipmentServicePublic32;
import com.dpd.common.service.types.shipmentservice._3.Address;
import com.dpd.common.service.types.shipmentservice._3.FaultCodeType;
import com.dpd.common.service.types.shipmentservice._3.GeneralShipmentData;
import com.dpd.common.service.types.shipmentservice._3.Notification;
import com.dpd.common.service.types.shipmentservice._3.Parcel;
import com.dpd.common.service.types.shipmentservice._3.ParcelInformationType;
import com.dpd.common.service.types.shipmentservice._3.Pickup;
import com.dpd.common.service.types.shipmentservice._3.PrintOptions;
import com.dpd.common.service.types.shipmentservice._3.ProductAndServiceData;
import com.dpd.common.service.types.shipmentservice._3.ShipmentResponse;
import com.dpd.common.service.types.shipmentservice._3.ShipmentServiceData;
import com.dpd.common.service.types.shipmentservice._3.StartPosition;
import com.dpd.common.service.types.shipmentservice._3.StoreOrdersResponseType;
import com.dpd.common.ws.authentication.v2_0.types.Authentication;
import com.dpd.common.ws.loginservice.v2_0.AuthenticationFaultMsg;
import com.dpd.common.ws.loginservice.v2_0.types.Login;

public class ShipmentService32_storeOrders {

	public static void main(String[] args) throws SOAPException, IOException {

		// printOptions
		PrintOptions myPrintOptions = new PrintOptions();
		String printerLanguage = "PDF";
		myPrintOptions.setPrinterLanguage(printerLanguage);
		myPrintOptions.setPaperFormat("A4");
		myPrintOptions.setStartPosition(StartPosition.UPPER_LEFT);

		// order (1-30)
		List<ShipmentServiceData> dpdOrderDataList = new ArrayList<ShipmentServiceData>();
		ShipmentServiceData shipmentServiceData = new ShipmentServiceData();
		dpdOrderDataList.add(shipmentServiceData);

		// ----------- generalShipmentData
		GeneralShipmentData myGeneralShipmentData = new GeneralShipmentData();
		myGeneralShipmentData.setMpsCustomerReferenceNumber1("Article 123");
		myGeneralShipmentData.setMpsCustomerReferenceNumber2("Order 456");
		myGeneralShipmentData.setIdentificationNumber("Article 456");
		myGeneralShipmentData.setSendingDepot("0167");
		myGeneralShipmentData.setProduct("CL");
		myGeneralShipmentData.setMpsWeight(Long.valueOf(500));

		// ---------------------- sender
		Address mySender = new Address();
		mySender.setName1("abas GmbH");
		mySender.setName2("Tobias Kellermann");
		mySender.setStreet("Pfälzer Ring");
		mySender.setHouseNo("24-25");
		mySender.setState(null);
		mySender.setCountry("DE");
		mySender.setZipCode("68766");
		mySender.setCity("Hockenheim");
		mySender.setCustomerNumber("");
		mySender.setContact("");
		mySender.setPhone("");
		myGeneralShipmentData.setSender(mySender);

		// ---------------------- recipient
		Address myRecipient = new Address();
		myRecipient.setName1("DPD Deutschland GmbH");
		myRecipient.setName2("");
		myRecipient.setStreet("Wailandtstr.");
		myRecipient.setHouseNo("1");
		myRecipient.setState(null);
		myRecipient.setCountry("DE");
		myRecipient.setZipCode("63741");
		myRecipient.setCity("Aschaffenburg");
		myRecipient.setCustomerNumber("");
		myRecipient.setContact("");
		myRecipient.setPhone("");
		myGeneralShipmentData.setRecipient(myRecipient);

		shipmentServiceData.setGeneralShipmentData(myGeneralShipmentData);

		// ----------- parcels

		Parcel myParcel = new Parcel();
		myParcel.setCustomerReferenceNumber1("Article 123");
		myParcel.setCustomerReferenceNumber2("Order 456");
		myParcel.setWeight(500);
		myParcel.setContent("Smartphones");

		shipmentServiceData.getParcels().add(myParcel);

		myParcel = new Parcel();
		myParcel.setCustomerReferenceNumber1("Article 423");
		myParcel.setCustomerReferenceNumber2("Order 456");
		myParcel.setWeight(500);
		myParcel.setContent("Smartphones 2");

		shipmentServiceData.getParcels().add(myParcel);

		// ----------- productAndServiceData
		ProductAndServiceData myProductAndServiceData = new ProductAndServiceData();

		myProductAndServiceData.setOrderType("consignment");

		// ---------------------- pickup
		Pickup myPickup = new Pickup();
		myPickup.setTour(0);
		myPickup.setQuantity(1);
		myPickup.setDate(20180605);
		myPickup.setDay(2);
		myPickup.setFromTime1(1300);
		myPickup.setToTime1(1700);
		myPickup.setExtraPickup(true);

		// --------------------------------- collectionrequestaddress
		Address myCollectionRequestAddress = new Address();
		myCollectionRequestAddress.setName1("abas GmbH");
		myCollectionRequestAddress.setName2("Tobias Kellermann");
		myCollectionRequestAddress.setStreet("Pfälzer Ring");
		myCollectionRequestAddress.setHouseNo("24-25");
		myCollectionRequestAddress.setState(null);
		myCollectionRequestAddress.setCountry("DE");
		myCollectionRequestAddress.setZipCode("68766");
		myCollectionRequestAddress.setCity("Hockenheim");
		myCollectionRequestAddress.setCustomerNumber("");
		myCollectionRequestAddress.setContact("");
		myCollectionRequestAddress.setPhone("");
		myPickup.setCollectionRequestAddress(myCollectionRequestAddress);

		myProductAndServiceData.setPickup(myPickup);

		// ---------------------- predict
		Notification myNotification = new Notification();
		myNotification.setChannel(1);
		myNotification.setValue("m.mustermann@dpd.de");
		myNotification.setLanguage("DE");
		myProductAndServiceData.setPredict(myNotification);

		shipmentServiceData.setProductAndServiceData(myProductAndServiceData);

		// RESPONSE
		try {
			// URL myEndpointURL = new
			// URL("https://public-ws-stage.dpd.com/services/ShipmentService/V3_2/");
			ShipmentServicePublic32 myShipmentService32 = new ShipmentServicePublic32();
			ShipmentService32 service = myShipmentService32.getShipmentServicePublic32SOAP();

			// ShipmentServicePublic_3_2_SOAPStub myShipmentService32Webservice
			// = new ShipmentServicePublic_3_2_SOAPStub(
			// myEndpointURL, myShipmentService32Locator);
			Client client = ClientProxy.getClient(service);

			Map<String, Object> requestContext = client.getRequestContext();
			// Authentification
			String locale = "de_DE";
			Login auth = LoginService20_getAuth.getAuth("sandboxdpd", "xMmshh1", "de_DE");

			Authentication authentication = new Authentication();
			authentication.setAuthToken(auth.getAuthToken());
			authentication.setDelisId(auth.getDelisId());
			authentication.setMessageLanguage(locale);

			StoreOrdersResponseType myStoreOrdersResponse = new StoreOrdersResponseType();

			myStoreOrdersResponse = service.storeOrders(myPrintOptions, dpdOrderDataList, authentication);

			List<ShipmentResponse> myShipmentResponseList = myStoreOrdersResponse.getShipmentResponses();
			int zaehler = 1;
			if (myShipmentResponseList != null && myShipmentResponseList.size() > 0) {
				for (ShipmentResponse item : myShipmentResponseList) {
					if (item.getFaults() != null) {
						// Error Handling
						for (FaultCodeType myFault : item.getFaults()) {
							System.out.println("FAULT CODE: " + myFault.getFaultCode());
							System.out.println("FAULT STRING: " + myFault.getMessage() + "\n\n");
						}
					}
					{
						// Label PDF
						if (myStoreOrdersResponse.getParcellabelsPDF() != null) {
							String myBase64PDF = new String(
									Base64Utility.encode(myStoreOrdersResponse.getParcellabelsPDF()));
							System.out.println("Base64 PDF String: " + myBase64PDF + "\n\n");
							byte[] pdf_bytes = myStoreOrdersResponse.getParcellabelsPDF();
							FileOutputStream fos = new FileOutputStream("Test-PDF" + zaehler++ + ".pdf");
							fos.write(pdf_bytes);
							fos.close();
						}

						System.out.println("identificationNumber: " + item.getIdentificationNumber());
						System.out.println("mpsId: " + item.getMpsId());
						for (ParcelInformationType myParcelInformation : item.getParcelInformation()) {
							System.out.println("parcelLabelNumber: " + myParcelInformation.getParcelLabelNumber());
							System.out.println("dpdReference: " + myParcelInformation.getDpdReference());
						}
					}
				}
			}

		} catch (Exception ex) {
			System.out.println(ex.toString());
			ex.printStackTrace();

			if (ex instanceof AuthenticationFaultMsg) {
				System.out.println("FAULT CODE: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorCode());
				System.out.println("FAULT STRING: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorMessage());
			}

		}
	}
}
