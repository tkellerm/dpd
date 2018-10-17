
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains all information and scan data for a status.
 * 
 * <p>Java-Klasse für StatusInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StatusInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SHIPMENT"/&gt;
 *               &lt;enumeration value="ACCEPTED"/&gt;
 *               &lt;enumeration value="AT_SENDING_DEPOT"/&gt;
 *               &lt;enumeration value="ON_THE_ROAD"/&gt;
 *               &lt;enumeration value="AT_DELIVERY_DEPOT"/&gt;
 *               &lt;enumeration value="DELIVERED"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="label" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentLine"/&gt;
 *         &lt;element name="description" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem"/&gt;
 *         &lt;element name="statusHasBeenReached" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isCurrentStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showContactInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="location" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentLine" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentLine" minOccurs="0"/&gt;
 *         &lt;element name="normalItems" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="importantItems" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errorItems" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusInfo", propOrder = {
    "status",
    "label",
    "description",
    "statusHasBeenReached",
    "isCurrentStatus",
    "showContactInfo",
    "location",
    "date",
    "normalItems",
    "importantItems",
    "errorItems"
})
@XmlSeeAlso({
    ShipmentInfo.class
})
public class StatusInfo {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected ContentLine label;
    @XmlElement(required = true)
    protected ContentItem description;
    protected boolean statusHasBeenReached;
    protected boolean isCurrentStatus;
    protected boolean showContactInfo;
    protected ContentLine location;
    protected ContentLine date;
    protected List<ContentItem> normalItems;
    protected List<ContentItem> importantItems;
    protected List<ContentItem> errorItems;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentLine }
     *     
     */
    public ContentLine getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentLine }
     *     
     */
    public void setLabel(ContentLine value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentItem }
     *     
     */
    public ContentItem getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentItem }
     *     
     */
    public void setDescription(ContentItem value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der statusHasBeenReached-Eigenschaft ab.
     * 
     */
    public boolean isStatusHasBeenReached() {
        return statusHasBeenReached;
    }

    /**
     * Legt den Wert der statusHasBeenReached-Eigenschaft fest.
     * 
     */
    public void setStatusHasBeenReached(boolean value) {
        this.statusHasBeenReached = value;
    }

    /**
     * Ruft den Wert der isCurrentStatus-Eigenschaft ab.
     * 
     */
    public boolean isIsCurrentStatus() {
        return isCurrentStatus;
    }

    /**
     * Legt den Wert der isCurrentStatus-Eigenschaft fest.
     * 
     */
    public void setIsCurrentStatus(boolean value) {
        this.isCurrentStatus = value;
    }

    /**
     * Ruft den Wert der showContactInfo-Eigenschaft ab.
     * 
     */
    public boolean isShowContactInfo() {
        return showContactInfo;
    }

    /**
     * Legt den Wert der showContactInfo-Eigenschaft fest.
     * 
     */
    public void setShowContactInfo(boolean value) {
        this.showContactInfo = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentLine }
     *     
     */
    public ContentLine getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentLine }
     *     
     */
    public void setLocation(ContentLine value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentLine }
     *     
     */
    public ContentLine getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentLine }
     *     
     */
    public void setDate(ContentLine value) {
        this.date = value;
    }

    /**
     * Gets the value of the normalItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normalItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormalItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentItem }
     * 
     * 
     */
    public List<ContentItem> getNormalItems() {
        if (normalItems == null) {
            normalItems = new ArrayList<ContentItem>();
        }
        return this.normalItems;
    }

    /**
     * Gets the value of the importantItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importantItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportantItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentItem }
     * 
     * 
     */
    public List<ContentItem> getImportantItems() {
        if (importantItems == null) {
            importantItems = new ArrayList<ContentItem>();
        }
        return this.importantItems;
    }

    /**
     * Gets the value of the errorItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentItem }
     * 
     * 
     */
    public List<ContentItem> getErrorItems() {
        if (errorItems == null) {
            errorItems = new ArrayList<ContentItem>();
        }
        return this.errorItems;
    }

}
