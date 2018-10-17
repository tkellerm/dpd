
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dpd.common.service.types.shipmentservice._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StoreOrders_QNAME = new QName("http://dpd.com/common/service/types/ShipmentService/3.2", "storeOrders");
    private final static QName _StoreOrdersResponse_QNAME = new QName("http://dpd.com/common/service/types/ShipmentService/3.2", "storeOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dpd.common.service.types.shipmentservice._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StoreOrders }
     * 
     */
    public StoreOrders createStoreOrders() {
        return new StoreOrders();
    }

    /**
     * Create an instance of {@link StoreOrdersResponse }
     * 
     */
    public StoreOrdersResponse createStoreOrdersResponse() {
        return new StoreOrdersResponse();
    }

    /**
     * Create an instance of {@link StoreOrdersResponseType }
     * 
     */
    public StoreOrdersResponseType createStoreOrdersResponseType() {
        return new StoreOrdersResponseType();
    }

    /**
     * Create an instance of {@link ShipmentResponse }
     * 
     */
    public ShipmentResponse createShipmentResponse() {
        return new ShipmentResponse();
    }

    /**
     * Create an instance of {@link ShipmentServiceData }
     * 
     */
    public ShipmentServiceData createShipmentServiceData() {
        return new ShipmentServiceData();
    }

    /**
     * Create an instance of {@link GeneralShipmentData }
     * 
     */
    public GeneralShipmentData createGeneralShipmentData() {
        return new GeneralShipmentData();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Parcel }
     * 
     */
    public Parcel createParcel() {
        return new Parcel();
    }

    /**
     * Create an instance of {@link ProductAndServiceData }
     * 
     */
    public ProductAndServiceData createProductAndServiceData() {
        return new ProductAndServiceData();
    }

    /**
     * Create an instance of {@link International }
     * 
     */
    public International createInternational() {
        return new International();
    }

    /**
     * Create an instance of {@link Delivery }
     * 
     */
    public Delivery createDelivery() {
        return new Delivery();
    }

    /**
     * Create an instance of {@link ProactiveNotification }
     * 
     */
    public ProactiveNotification createProactiveNotification() {
        return new ProactiveNotification();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link Cod }
     * 
     */
    public Cod createCod() {
        return new Cod();
    }

    /**
     * Create an instance of {@link Hazardous }
     * 
     */
    public Hazardous createHazardous() {
        return new Hazardous();
    }

    /**
     * Create an instance of {@link PersonalDelivery }
     * 
     */
    public PersonalDelivery createPersonalDelivery() {
        return new PersonalDelivery();
    }

    /**
     * Create an instance of {@link Pickup }
     * 
     */
    public Pickup createPickup() {
        return new Pickup();
    }

    /**
     * Create an instance of {@link ParcelInformationType }
     * 
     */
    public ParcelInformationType createParcelInformationType() {
        return new ParcelInformationType();
    }

    /**
     * Create an instance of {@link FaultCodeType }
     * 
     */
    public FaultCodeType createFaultCodeType() {
        return new FaultCodeType();
    }

    /**
     * Create an instance of {@link HigherInsurance }
     * 
     */
    public HigherInsurance createHigherInsurance() {
        return new HigherInsurance();
    }

    /**
     * Create an instance of {@link ParcelShopDelivery }
     * 
     */
    public ParcelShopDelivery createParcelShopDelivery() {
        return new ParcelShopDelivery();
    }

    /**
     * Create an instance of {@link PrintOptions }
     * 
     */
    public PrintOptions createPrintOptions() {
        return new PrintOptions();
    }

    /**
     * Create an instance of {@link Printer }
     * 
     */
    public Printer createPrinter() {
        return new Printer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ShipmentService/3.2", name = "storeOrders")
    public JAXBElement<StoreOrders> createStoreOrders(StoreOrders value) {
        return new JAXBElement<StoreOrders>(_StoreOrders_QNAME, StoreOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ShipmentService/3.2", name = "storeOrdersResponse")
    public JAXBElement<StoreOrdersResponse> createStoreOrdersResponse(StoreOrdersResponse value) {
        return new JAXBElement<StoreOrdersResponse>(_StoreOrdersResponse_QNAME, StoreOrdersResponse.class, null, value);
    }

}
