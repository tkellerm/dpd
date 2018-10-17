
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Result type for tracking data.
 * 
 * <p>Java-Klasse für TrackingResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrackingResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipmentInfo" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ShipmentInfo" minOccurs="0"/&gt;
 *         &lt;element name="statusInfo" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}StatusInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactInfo" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingResult", propOrder = {
    "shipmentInfo",
    "statusInfo",
    "contactInfo"
})
public class TrackingResult {

    protected ShipmentInfo shipmentInfo;
    protected List<StatusInfo> statusInfo;
    protected List<ContentItem> contactInfo;

    /**
     * Ruft den Wert der shipmentInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInfo }
     *     
     */
    public ShipmentInfo getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * Legt den Wert der shipmentInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInfo }
     *     
     */
    public void setShipmentInfo(ShipmentInfo value) {
        this.shipmentInfo = value;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInfo }
     * 
     * 
     */
    public List<StatusInfo> getStatusInfo() {
        if (statusInfo == null) {
            statusInfo = new ArrayList<StatusInfo>();
        }
        return this.statusInfo;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentItem }
     * 
     * 
     */
    public List<ContentItem> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContentItem>();
        }
        return this.contactInfo;
    }

}
