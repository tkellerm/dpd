
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für international complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="international"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parcelType" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customsAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsCurrency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsTerms"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsContent"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsTarif" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsPaper" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsEnclosure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customsInvoice" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsInvoiceDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="99999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsAmountParcel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="999999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customsOrigin" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="linehaul" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="AI"/&gt;
 *               &lt;enumeration value="RO"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shipMrn" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collectiveCustomsClearance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="invoicePosition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comment1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comment2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="commercialInvoiceConsigneeVatNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="commercialInvoiceConsignee" type="{http://dpd.com/common/service/types/ShipmentService/3.2}address"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "international", propOrder = {
    "parcelType",
    "customsAmount",
    "customsCurrency",
    "customsTerms",
    "customsContent",
    "customsTarif",
    "customsPaper",
    "customsEnclosure",
    "customsInvoice",
    "customsInvoiceDate",
    "customsAmountParcel",
    "customsOrigin",
    "linehaul",
    "shipMrn",
    "collectiveCustomsClearance",
    "invoicePosition",
    "comment1",
    "comment2",
    "commercialInvoiceConsigneeVatNumber",
    "commercialInvoiceConsignee"
})
public class International {

    protected boolean parcelType;
    protected long customsAmount;
    @XmlElement(required = true)
    protected String customsCurrency;
    @XmlElement(required = true)
    protected String customsTerms;
    @XmlElement(required = true)
    protected String customsContent;
    protected String customsTarif;
    protected String customsPaper;
    protected Boolean customsEnclosure;
    protected String customsInvoice;
    protected Integer customsInvoiceDate;
    protected Long customsAmountParcel;
    protected String customsOrigin;
    protected String linehaul;
    protected String shipMrn;
    protected Boolean collectiveCustomsClearance;
    protected String invoicePosition;
    protected String comment1;
    protected String comment2;
    protected String commercialInvoiceConsigneeVatNumber;
    @XmlElement(required = true)
    protected Address commercialInvoiceConsignee;

    /**
     * Ruft den Wert der parcelType-Eigenschaft ab.
     * 
     */
    public boolean isParcelType() {
        return parcelType;
    }

    /**
     * Legt den Wert der parcelType-Eigenschaft fest.
     * 
     */
    public void setParcelType(boolean value) {
        this.parcelType = value;
    }

    /**
     * Ruft den Wert der customsAmount-Eigenschaft ab.
     * 
     */
    public long getCustomsAmount() {
        return customsAmount;
    }

    /**
     * Legt den Wert der customsAmount-Eigenschaft fest.
     * 
     */
    public void setCustomsAmount(long value) {
        this.customsAmount = value;
    }

    /**
     * Ruft den Wert der customsCurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCurrency() {
        return customsCurrency;
    }

    /**
     * Legt den Wert der customsCurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCurrency(String value) {
        this.customsCurrency = value;
    }

    /**
     * Ruft den Wert der customsTerms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsTerms() {
        return customsTerms;
    }

    /**
     * Legt den Wert der customsTerms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsTerms(String value) {
        this.customsTerms = value;
    }

    /**
     * Ruft den Wert der customsContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsContent() {
        return customsContent;
    }

    /**
     * Legt den Wert der customsContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsContent(String value) {
        this.customsContent = value;
    }

    /**
     * Ruft den Wert der customsTarif-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsTarif() {
        return customsTarif;
    }

    /**
     * Legt den Wert der customsTarif-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsTarif(String value) {
        this.customsTarif = value;
    }

    /**
     * Ruft den Wert der customsPaper-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsPaper() {
        return customsPaper;
    }

    /**
     * Legt den Wert der customsPaper-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsPaper(String value) {
        this.customsPaper = value;
    }

    /**
     * Ruft den Wert der customsEnclosure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomsEnclosure() {
        return customsEnclosure;
    }

    /**
     * Legt den Wert der customsEnclosure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomsEnclosure(Boolean value) {
        this.customsEnclosure = value;
    }

    /**
     * Ruft den Wert der customsInvoice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsInvoice() {
        return customsInvoice;
    }

    /**
     * Legt den Wert der customsInvoice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsInvoice(String value) {
        this.customsInvoice = value;
    }

    /**
     * Ruft den Wert der customsInvoiceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomsInvoiceDate() {
        return customsInvoiceDate;
    }

    /**
     * Legt den Wert der customsInvoiceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomsInvoiceDate(Integer value) {
        this.customsInvoiceDate = value;
    }

    /**
     * Ruft den Wert der customsAmountParcel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomsAmountParcel() {
        return customsAmountParcel;
    }

    /**
     * Legt den Wert der customsAmountParcel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomsAmountParcel(Long value) {
        this.customsAmountParcel = value;
    }

    /**
     * Ruft den Wert der customsOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOrigin() {
        return customsOrigin;
    }

    /**
     * Legt den Wert der customsOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOrigin(String value) {
        this.customsOrigin = value;
    }

    /**
     * Ruft den Wert der linehaul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinehaul() {
        return linehaul;
    }

    /**
     * Legt den Wert der linehaul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinehaul(String value) {
        this.linehaul = value;
    }

    /**
     * Ruft den Wert der shipMrn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMrn() {
        return shipMrn;
    }

    /**
     * Legt den Wert der shipMrn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMrn(String value) {
        this.shipMrn = value;
    }

    /**
     * Ruft den Wert der collectiveCustomsClearance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectiveCustomsClearance() {
        return collectiveCustomsClearance;
    }

    /**
     * Legt den Wert der collectiveCustomsClearance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectiveCustomsClearance(Boolean value) {
        this.collectiveCustomsClearance = value;
    }

    /**
     * Ruft den Wert der invoicePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicePosition() {
        return invoicePosition;
    }

    /**
     * Legt den Wert der invoicePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicePosition(String value) {
        this.invoicePosition = value;
    }

    /**
     * Ruft den Wert der comment1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * Legt den Wert der comment1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment1(String value) {
        this.comment1 = value;
    }

    /**
     * Ruft den Wert der comment2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment2() {
        return comment2;
    }

    /**
     * Legt den Wert der comment2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment2(String value) {
        this.comment2 = value;
    }

    /**
     * Ruft den Wert der commercialInvoiceConsigneeVatNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialInvoiceConsigneeVatNumber() {
        return commercialInvoiceConsigneeVatNumber;
    }

    /**
     * Legt den Wert der commercialInvoiceConsigneeVatNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialInvoiceConsigneeVatNumber(String value) {
        this.commercialInvoiceConsigneeVatNumber = value;
    }

    /**
     * Ruft den Wert der commercialInvoiceConsignee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCommercialInvoiceConsignee() {
        return commercialInvoiceConsignee;
    }

    /**
     * Legt den Wert der commercialInvoiceConsignee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCommercialInvoiceConsignee(Address value) {
        this.commercialInvoiceConsignee = value;
    }

}
