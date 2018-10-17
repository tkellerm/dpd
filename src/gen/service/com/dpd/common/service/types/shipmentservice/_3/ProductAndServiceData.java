
package com.dpd.common.service.types.shipmentservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für productAndServiceData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="productAndServiceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="consignment"/&gt;
 *               &lt;enumeration value="collection request order"/&gt;
 *               &lt;enumeration value="pickup information"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="saturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="exWorksDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="guarantee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tyres" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="personalDelivery" type="{http://dpd.com/common/service/types/ShipmentService/3.2}personalDelivery" minOccurs="0"/&gt;
 *         &lt;element name="pickup" type="{http://dpd.com/common/service/types/ShipmentService/3.2}pickup" minOccurs="0"/&gt;
 *         &lt;element name="parcelShopDelivery" type="{http://dpd.com/common/service/types/ShipmentService/3.2}parcelShopDelivery" minOccurs="0"/&gt;
 *         &lt;element name="predict" type="{http://dpd.com/common/service/types/ShipmentService/3.2}notification" minOccurs="0"/&gt;
 *         &lt;element name="personalDeliveryNotification" type="{http://dpd.com/common/service/types/ShipmentService/3.2}notification" minOccurs="0"/&gt;
 *         &lt;element name="proactiveNotification" type="{http://dpd.com/common/service/types/ShipmentService/3.2}proactiveNotification" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="delivery" type="{http://dpd.com/common/service/types/ShipmentService/3.2}delivery" minOccurs="0"/&gt;
 *         &lt;element name="invoiceAddress" type="{http://dpd.com/common/service/types/ShipmentService/3.2}address" minOccurs="0"/&gt;
 *         &lt;element name="countrySpecificService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productAndServiceData", propOrder = {
    "orderType",
    "saturdayDelivery",
    "exWorksDelivery",
    "guarantee",
    "tyres",
    "personalDelivery",
    "pickup",
    "parcelShopDelivery",
    "predict",
    "personalDeliveryNotification",
    "proactiveNotification",
    "delivery",
    "invoiceAddress",
    "countrySpecificService"
})
public class ProductAndServiceData {

    @XmlElement(required = true)
    protected String orderType;
    protected Boolean saturdayDelivery;
    protected Boolean exWorksDelivery;
    protected Boolean guarantee;
    protected Boolean tyres;
    protected PersonalDelivery personalDelivery;
    protected Pickup pickup;
    protected ParcelShopDelivery parcelShopDelivery;
    protected Notification predict;
    protected Notification personalDeliveryNotification;
    protected List<ProactiveNotification> proactiveNotification;
    protected Delivery delivery;
    protected Address invoiceAddress;
    protected String countrySpecificService;

    /**
     * Ruft den Wert der orderType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Legt den Wert der orderType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Ruft den Wert der saturdayDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayDelivery() {
        return saturdayDelivery;
    }

    /**
     * Legt den Wert der saturdayDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayDelivery(Boolean value) {
        this.saturdayDelivery = value;
    }

    /**
     * Ruft den Wert der exWorksDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExWorksDelivery() {
        return exWorksDelivery;
    }

    /**
     * Legt den Wert der exWorksDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExWorksDelivery(Boolean value) {
        this.exWorksDelivery = value;
    }

    /**
     * Ruft den Wert der guarantee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuarantee() {
        return guarantee;
    }

    /**
     * Legt den Wert der guarantee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuarantee(Boolean value) {
        this.guarantee = value;
    }

    /**
     * Ruft den Wert der tyres-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTyres() {
        return tyres;
    }

    /**
     * Legt den Wert der tyres-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTyres(Boolean value) {
        this.tyres = value;
    }

    /**
     * Ruft den Wert der personalDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDelivery }
     *     
     */
    public PersonalDelivery getPersonalDelivery() {
        return personalDelivery;
    }

    /**
     * Legt den Wert der personalDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDelivery }
     *     
     */
    public void setPersonalDelivery(PersonalDelivery value) {
        this.personalDelivery = value;
    }

    /**
     * Ruft den Wert der pickup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Pickup }
     *     
     */
    public Pickup getPickup() {
        return pickup;
    }

    /**
     * Legt den Wert der pickup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Pickup }
     *     
     */
    public void setPickup(Pickup value) {
        this.pickup = value;
    }

    /**
     * Ruft den Wert der parcelShopDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParcelShopDelivery }
     *     
     */
    public ParcelShopDelivery getParcelShopDelivery() {
        return parcelShopDelivery;
    }

    /**
     * Legt den Wert der parcelShopDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParcelShopDelivery }
     *     
     */
    public void setParcelShopDelivery(ParcelShopDelivery value) {
        this.parcelShopDelivery = value;
    }

    /**
     * Ruft den Wert der predict-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getPredict() {
        return predict;
    }

    /**
     * Legt den Wert der predict-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setPredict(Notification value) {
        this.predict = value;
    }

    /**
     * Ruft den Wert der personalDeliveryNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getPersonalDeliveryNotification() {
        return personalDeliveryNotification;
    }

    /**
     * Legt den Wert der personalDeliveryNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setPersonalDeliveryNotification(Notification value) {
        this.personalDeliveryNotification = value;
    }

    /**
     * Gets the value of the proactiveNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proactiveNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProactiveNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProactiveNotification }
     * 
     * 
     */
    public List<ProactiveNotification> getProactiveNotification() {
        if (proactiveNotification == null) {
            proactiveNotification = new ArrayList<ProactiveNotification>();
        }
        return this.proactiveNotification;
    }

    /**
     * Ruft den Wert der delivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * Legt den Wert der delivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setDelivery(Delivery value) {
        this.delivery = value;
    }

    /**
     * Ruft den Wert der invoiceAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Legt den Wert der invoiceAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setInvoiceAddress(Address value) {
        this.invoiceAddress = value;
    }

    /**
     * Ruft den Wert der countrySpecificService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySpecificService() {
        return countrySpecificService;
    }

    /**
     * Legt den Wert der countrySpecificService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySpecificService(String value) {
        this.countrySpecificService = value;
    }

}
