
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Bundles general shipment data.
 * 
 * <p>Java-Klasse für generalShipmentData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="generalShipmentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mpsId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsCustomerReferenceNumber1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsCustomerReferenceNumber2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsCustomerReferenceNumber3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsCustomerReferenceNumber4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identificationNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sendingDepot"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="product"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="CL"/&gt;
 *               &lt;enumeration value="E830"/&gt;
 *               &lt;enumeration value="E10"/&gt;
 *               &lt;enumeration value="E12"/&gt;
 *               &lt;enumeration value="E18"/&gt;
 *               &lt;enumeration value="IE2"/&gt;
 *               &lt;enumeration value="PL"/&gt;
 *               &lt;enumeration value="PL+"/&gt;
 *               &lt;enumeration value="MAIL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsCompleteDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mpsCompleteDeliveryLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mpsVolume" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsWeight" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="99999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsExpectedSendingDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[2][0-9]{3}([0][0-9]|[1][0-2])(0[1-9]|[12][0-9]|3[01])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mpsExpectedSendingTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(([1][0-9]|[2][0-3]|[0][0-9])([0-5][0-9])([0-5][0-9]))|([0-9]([0-5][0-9])([0-5][0-9]))"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sender" type="{http://dpd.com/common/service/types/ShipmentService/3.2}address"/&gt;
 *         &lt;element name="recipient" type="{http://dpd.com/common/service/types/ShipmentService/3.2}address"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalShipmentData", propOrder = {
    "mpsId",
    "cUser",
    "mpsCustomerReferenceNumber1",
    "mpsCustomerReferenceNumber2",
    "mpsCustomerReferenceNumber3",
    "mpsCustomerReferenceNumber4",
    "identificationNumber",
    "sendingDepot",
    "product",
    "mpsCompleteDelivery",
    "mpsCompleteDeliveryLabel",
    "mpsVolume",
    "mpsWeight",
    "mpsExpectedSendingDate",
    "mpsExpectedSendingTime",
    "sender",
    "recipient"
})
public class GeneralShipmentData {

    protected String mpsId;
    protected String cUser;
    protected String mpsCustomerReferenceNumber1;
    protected String mpsCustomerReferenceNumber2;
    protected String mpsCustomerReferenceNumber3;
    protected String mpsCustomerReferenceNumber4;
    protected String identificationNumber;
    @XmlElement(required = true)
    protected String sendingDepot;
    @XmlElement(required = true)
    protected String product;
    protected Boolean mpsCompleteDelivery;
    protected Boolean mpsCompleteDeliveryLabel;
    protected Long mpsVolume;
    protected Long mpsWeight;
    protected String mpsExpectedSendingDate;
    protected String mpsExpectedSendingTime;
    @XmlElement(required = true)
    protected Address sender;
    @XmlElement(required = true)
    protected Address recipient;

    /**
     * Ruft den Wert der mpsId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsId() {
        return mpsId;
    }

    /**
     * Legt den Wert der mpsId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsId(String value) {
        this.mpsId = value;
    }

    /**
     * Ruft den Wert der cUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUser() {
        return cUser;
    }

    /**
     * Legt den Wert der cUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUser(String value) {
        this.cUser = value;
    }

    /**
     * Ruft den Wert der mpsCustomerReferenceNumber1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsCustomerReferenceNumber1() {
        return mpsCustomerReferenceNumber1;
    }

    /**
     * Legt den Wert der mpsCustomerReferenceNumber1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsCustomerReferenceNumber1(String value) {
        this.mpsCustomerReferenceNumber1 = value;
    }

    /**
     * Ruft den Wert der mpsCustomerReferenceNumber2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsCustomerReferenceNumber2() {
        return mpsCustomerReferenceNumber2;
    }

    /**
     * Legt den Wert der mpsCustomerReferenceNumber2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsCustomerReferenceNumber2(String value) {
        this.mpsCustomerReferenceNumber2 = value;
    }

    /**
     * Ruft den Wert der mpsCustomerReferenceNumber3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsCustomerReferenceNumber3() {
        return mpsCustomerReferenceNumber3;
    }

    /**
     * Legt den Wert der mpsCustomerReferenceNumber3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsCustomerReferenceNumber3(String value) {
        this.mpsCustomerReferenceNumber3 = value;
    }

    /**
     * Ruft den Wert der mpsCustomerReferenceNumber4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsCustomerReferenceNumber4() {
        return mpsCustomerReferenceNumber4;
    }

    /**
     * Legt den Wert der mpsCustomerReferenceNumber4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsCustomerReferenceNumber4(String value) {
        this.mpsCustomerReferenceNumber4 = value;
    }

    /**
     * Ruft den Wert der identificationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Legt den Wert der identificationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Ruft den Wert der sendingDepot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingDepot() {
        return sendingDepot;
    }

    /**
     * Legt den Wert der sendingDepot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingDepot(String value) {
        this.sendingDepot = value;
    }

    /**
     * Ruft den Wert der product-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Legt den Wert der product-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Ruft den Wert der mpsCompleteDelivery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMpsCompleteDelivery() {
        return mpsCompleteDelivery;
    }

    /**
     * Legt den Wert der mpsCompleteDelivery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMpsCompleteDelivery(Boolean value) {
        this.mpsCompleteDelivery = value;
    }

    /**
     * Ruft den Wert der mpsCompleteDeliveryLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMpsCompleteDeliveryLabel() {
        return mpsCompleteDeliveryLabel;
    }

    /**
     * Legt den Wert der mpsCompleteDeliveryLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMpsCompleteDeliveryLabel(Boolean value) {
        this.mpsCompleteDeliveryLabel = value;
    }

    /**
     * Ruft den Wert der mpsVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMpsVolume() {
        return mpsVolume;
    }

    /**
     * Legt den Wert der mpsVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMpsVolume(Long value) {
        this.mpsVolume = value;
    }

    /**
     * Ruft den Wert der mpsWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMpsWeight() {
        return mpsWeight;
    }

    /**
     * Legt den Wert der mpsWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMpsWeight(Long value) {
        this.mpsWeight = value;
    }

    /**
     * Ruft den Wert der mpsExpectedSendingDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsExpectedSendingDate() {
        return mpsExpectedSendingDate;
    }

    /**
     * Legt den Wert der mpsExpectedSendingDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsExpectedSendingDate(String value) {
        this.mpsExpectedSendingDate = value;
    }

    /**
     * Ruft den Wert der mpsExpectedSendingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsExpectedSendingTime() {
        return mpsExpectedSendingTime;
    }

    /**
     * Legt den Wert der mpsExpectedSendingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsExpectedSendingTime(String value) {
        this.mpsExpectedSendingTime = value;
    }

    /**
     * Ruft den Wert der sender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSender() {
        return sender;
    }

    /**
     * Legt den Wert der sender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSender(Address value) {
        this.sender = value;
    }

    /**
     * Ruft den Wert der recipient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRecipient() {
        return recipient;
    }

    /**
     * Legt den Wert der recipient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRecipient(Address value) {
        this.recipient = value;
    }

}
