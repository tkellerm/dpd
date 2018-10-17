
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains general shipment information (e.g. service code).
 * 
 * <p>Java-Klasse für ShipmentInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}StatusInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receiver" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" minOccurs="0"/&gt;
 *         &lt;element name="predictInformation" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" minOccurs="0"/&gt;
 *         &lt;element name="serviceDescription" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" minOccurs="0"/&gt;
 *         &lt;element name="additionalServiceElements" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" minOccurs="0"/&gt;
 *         &lt;element name="trackingProperty" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}TrackingProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInfo", propOrder = {
    "receiver",
    "predictInformation",
    "serviceDescription",
    "additionalServiceElements",
    "trackingProperty"
})
public class ShipmentInfo
    extends StatusInfo
{

    protected ContentItem receiver;
    protected ContentItem predictInformation;
    protected ContentItem serviceDescription;
    protected ContentItem additionalServiceElements;
    protected List<TrackingProperty> trackingProperty;

    /**
     * Ruft den Wert der receiver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentItem }
     *     
     */
    public ContentItem getReceiver() {
        return receiver;
    }

    /**
     * Legt den Wert der receiver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItem }
     *     
     */
    public void setReceiver(ContentItem value) {
        this.receiver = value;
    }

    /**
     * Ruft den Wert der predictInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentItem }
     *     
     */
    public ContentItem getPredictInformation() {
        return predictInformation;
    }

    /**
     * Legt den Wert der predictInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItem }
     *     
     */
    public void setPredictInformation(ContentItem value) {
        this.predictInformation = value;
    }

    /**
     * Ruft den Wert der serviceDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentItem }
     *     
     */
    public ContentItem getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Legt den Wert der serviceDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItem }
     *     
     */
    public void setServiceDescription(ContentItem value) {
        this.serviceDescription = value;
    }

    /**
     * Ruft den Wert der additionalServiceElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentItem }
     *     
     */
    public ContentItem getAdditionalServiceElements() {
        return additionalServiceElements;
    }

    /**
     * Legt den Wert der additionalServiceElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItem }
     *     
     */
    public void setAdditionalServiceElements(ContentItem value) {
        this.additionalServiceElements = value;
    }

    /**
     * Gets the value of the trackingProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingProperty }
     * 
     * 
     */
    public List<TrackingProperty> getTrackingProperty() {
        if (trackingProperty == null) {
            trackingProperty = new ArrayList<TrackingProperty>();
        }
        return this.trackingProperty;
    }

}
