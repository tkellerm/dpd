
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dpd.common.ws_public.parcellifecycleservice.v2_0.types package. 
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

    private final static QName _GetTrackingData_QNAME = new QName("http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", "getTrackingData");
    private final static QName _GetTrackingDataResponse_QNAME = new QName("http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", "getTrackingDataResponse");
    private final static QName _GetParcelLabelNumberForWebNumber_QNAME = new QName("http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", "getParcelLabelNumberForWebNumber");
    private final static QName _GetParcelLabelNumberForWebNumberResponse_QNAME = new QName("http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", "getParcelLabelNumberForWebNumberResponse");
    private final static QName _DataFault_QNAME = new QName("http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", "dataFault");
    private final static QName _SystemFault_QNAME = new QName("http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", "systemFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dpd.common.ws_public.parcellifecycleservice.v2_0.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTrackingData }
     * 
     */
    public GetTrackingData createGetTrackingData() {
        return new GetTrackingData();
    }

    /**
     * Create an instance of {@link GetTrackingDataResponse }
     * 
     */
    public GetTrackingDataResponse createGetTrackingDataResponse() {
        return new GetTrackingDataResponse();
    }

    /**
     * Create an instance of {@link GetParcelLabelNumberForWebNumber }
     * 
     */
    public GetParcelLabelNumberForWebNumber createGetParcelLabelNumberForWebNumber() {
        return new GetParcelLabelNumberForWebNumber();
    }

    /**
     * Create an instance of {@link GetParcelLabelNumberForWebNumberResponse }
     * 
     */
    public GetParcelLabelNumberForWebNumberResponse createGetParcelLabelNumberForWebNumberResponse() {
        return new GetParcelLabelNumberForWebNumberResponse();
    }

    /**
     * Create an instance of {@link DataFault }
     * 
     */
    public DataFault createDataFault() {
        return new DataFault();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link TrackingResult }
     * 
     */
    public TrackingResult createTrackingResult() {
        return new TrackingResult();
    }

    /**
     * Create an instance of {@link ContentLine }
     * 
     */
    public ContentLine createContentLine() {
        return new ContentLine();
    }

    /**
     * Create an instance of {@link ContentItem }
     * 
     */
    public ContentItem createContentItem() {
        return new ContentItem();
    }

    /**
     * Create an instance of {@link StatusInfo }
     * 
     */
    public StatusInfo createStatusInfo() {
        return new StatusInfo();
    }

    /**
     * Create an instance of {@link ShipmentInfo }
     * 
     */
    public ShipmentInfo createShipmentInfo() {
        return new ShipmentInfo();
    }

    /**
     * Create an instance of {@link TrackingProperty }
     * 
     */
    public TrackingProperty createTrackingProperty() {
        return new TrackingProperty();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackingData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", name = "getTrackingData")
    public JAXBElement<GetTrackingData> createGetTrackingData(GetTrackingData value) {
        return new JAXBElement<GetTrackingData>(_GetTrackingData_QNAME, GetTrackingData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrackingDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", name = "getTrackingDataResponse")
    public JAXBElement<GetTrackingDataResponse> createGetTrackingDataResponse(GetTrackingDataResponse value) {
        return new JAXBElement<GetTrackingDataResponse>(_GetTrackingDataResponse_QNAME, GetTrackingDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParcelLabelNumberForWebNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", name = "getParcelLabelNumberForWebNumber")
    public JAXBElement<GetParcelLabelNumberForWebNumber> createGetParcelLabelNumberForWebNumber(GetParcelLabelNumberForWebNumber value) {
        return new JAXBElement<GetParcelLabelNumberForWebNumber>(_GetParcelLabelNumberForWebNumber_QNAME, GetParcelLabelNumberForWebNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParcelLabelNumberForWebNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", name = "getParcelLabelNumberForWebNumberResponse")
    public JAXBElement<GetParcelLabelNumberForWebNumberResponse> createGetParcelLabelNumberForWebNumberResponse(GetParcelLabelNumberForWebNumberResponse value) {
        return new JAXBElement<GetParcelLabelNumberForWebNumberResponse>(_GetParcelLabelNumberForWebNumberResponse_QNAME, GetParcelLabelNumberForWebNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", name = "dataFault")
    public JAXBElement<DataFault> createDataFault(DataFault value) {
        return new JAXBElement<DataFault>(_DataFault_QNAME, DataFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/ParcelLifeCycleService/2.0", name = "systemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

}
