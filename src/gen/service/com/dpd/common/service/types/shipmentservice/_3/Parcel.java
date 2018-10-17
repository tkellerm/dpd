
package com.dpd.common.service.types.shipmentservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für parcel complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parcel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parcelLabelNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="11"/&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerReferenceNumber1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerReferenceNumber2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerReferenceNumber3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerReferenceNumber4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="swap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="volume" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="weight" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="99999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hazardousLimitedQuantities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="higherInsurance" type="{http://dpd.com/common/service/types/ShipmentService/3.2}higherInsurance" minOccurs="0"/&gt;
 *         &lt;element name="content" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addService" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="messageNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="99999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="function" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="LOCKDZB"/&gt;
 *               &lt;enumeration value="LOCKASG"/&gt;
 *               &lt;enumeration value="LOCKEVM"/&gt;
 *               &lt;enumeration value="LOCKSHOP"/&gt;
 *               &lt;enumeration value="LOCKTV"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="parameter" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cod" type="{http://dpd.com/common/service/types/ShipmentService/3.2}cod" minOccurs="0"/&gt;
 *         &lt;element name="international" type="{http://dpd.com/common/service/types/ShipmentService/3.2}international" minOccurs="0"/&gt;
 *         &lt;element name="hazardous" type="{http://dpd.com/common/service/types/ShipmentService/3.2}hazardous" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="printInfo1OnParcelLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="info1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="29"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="info2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="returns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcel", propOrder = {
    "parcelLabelNumber",
    "customerReferenceNumber1",
    "customerReferenceNumber2",
    "customerReferenceNumber3",
    "customerReferenceNumber4",
    "swap",
    "volume",
    "weight",
    "hazardousLimitedQuantities",
    "higherInsurance",
    "content",
    "addService",
    "messageNumber",
    "function",
    "parameter",
    "cod",
    "international",
    "hazardous",
    "printInfo1OnParcelLabel",
    "info1",
    "info2",
    "returns"
})
public class Parcel {

    protected String parcelLabelNumber;
    protected String customerReferenceNumber1;
    protected String customerReferenceNumber2;
    protected String customerReferenceNumber3;
    protected String customerReferenceNumber4;
    protected Boolean swap;
    protected Integer volume;
    protected Integer weight;
    protected Boolean hazardousLimitedQuantities;
    protected HigherInsurance higherInsurance;
    protected String content;
    protected Integer addService;
    protected Integer messageNumber;
    protected String function;
    protected String parameter;
    protected Cod cod;
    protected International international;
    protected List<Hazardous> hazardous;
    protected Boolean printInfo1OnParcelLabel;
    protected String info1;
    protected String info2;
    protected Boolean returns;

    /**
     * Ruft den Wert der parcelLabelNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelLabelNumber() {
        return parcelLabelNumber;
    }

    /**
     * Legt den Wert der parcelLabelNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelLabelNumber(String value) {
        this.parcelLabelNumber = value;
    }

    /**
     * Ruft den Wert der customerReferenceNumber1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceNumber1() {
        return customerReferenceNumber1;
    }

    /**
     * Legt den Wert der customerReferenceNumber1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReferenceNumber1(String value) {
        this.customerReferenceNumber1 = value;
    }

    /**
     * Ruft den Wert der customerReferenceNumber2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceNumber2() {
        return customerReferenceNumber2;
    }

    /**
     * Legt den Wert der customerReferenceNumber2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReferenceNumber2(String value) {
        this.customerReferenceNumber2 = value;
    }

    /**
     * Ruft den Wert der customerReferenceNumber3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceNumber3() {
        return customerReferenceNumber3;
    }

    /**
     * Legt den Wert der customerReferenceNumber3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReferenceNumber3(String value) {
        this.customerReferenceNumber3 = value;
    }

    /**
     * Ruft den Wert der customerReferenceNumber4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReferenceNumber4() {
        return customerReferenceNumber4;
    }

    /**
     * Legt den Wert der customerReferenceNumber4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReferenceNumber4(String value) {
        this.customerReferenceNumber4 = value;
    }

    /**
     * Ruft den Wert der swap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwap() {
        return swap;
    }

    /**
     * Legt den Wert der swap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwap(Boolean value) {
        this.swap = value;
    }

    /**
     * Ruft den Wert der volume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Legt den Wert der volume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVolume(Integer value) {
        this.volume = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der hazardousLimitedQuantities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHazardousLimitedQuantities() {
        return hazardousLimitedQuantities;
    }

    /**
     * Legt den Wert der hazardousLimitedQuantities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHazardousLimitedQuantities(Boolean value) {
        this.hazardousLimitedQuantities = value;
    }

    /**
     * Ruft den Wert der higherInsurance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HigherInsurance }
     *     
     */
    public HigherInsurance getHigherInsurance() {
        return higherInsurance;
    }

    /**
     * Legt den Wert der higherInsurance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HigherInsurance }
     *     
     */
    public void setHigherInsurance(HigherInsurance value) {
        this.higherInsurance = value;
    }

    /**
     * Ruft den Wert der content-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Ruft den Wert der addService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddService() {
        return addService;
    }

    /**
     * Legt den Wert der addService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddService(Integer value) {
        this.addService = value;
    }

    /**
     * Ruft den Wert der messageNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageNumber() {
        return messageNumber;
    }

    /**
     * Legt den Wert der messageNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageNumber(Integer value) {
        this.messageNumber = value;
    }

    /**
     * Ruft den Wert der function-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Legt den Wert der function-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Ruft den Wert der parameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Legt den Wert der parameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
    }

    /**
     * Ruft den Wert der cod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Cod }
     *     
     */
    public Cod getCod() {
        return cod;
    }

    /**
     * Legt den Wert der cod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Cod }
     *     
     */
    public void setCod(Cod value) {
        this.cod = value;
    }

    /**
     * Ruft den Wert der international-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link International }
     *     
     */
    public International getInternational() {
        return international;
    }

    /**
     * Legt den Wert der international-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link International }
     *     
     */
    public void setInternational(International value) {
        this.international = value;
    }

    /**
     * Gets the value of the hazardous property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardous property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardous().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hazardous }
     * 
     * 
     */
    public List<Hazardous> getHazardous() {
        if (hazardous == null) {
            hazardous = new ArrayList<Hazardous>();
        }
        return this.hazardous;
    }

    /**
     * Ruft den Wert der printInfo1OnParcelLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintInfo1OnParcelLabel() {
        return printInfo1OnParcelLabel;
    }

    /**
     * Legt den Wert der printInfo1OnParcelLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintInfo1OnParcelLabel(Boolean value) {
        this.printInfo1OnParcelLabel = value;
    }

    /**
     * Ruft den Wert der info1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo1() {
        return info1;
    }

    /**
     * Legt den Wert der info1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo1(String value) {
        this.info1 = value;
    }

    /**
     * Ruft den Wert der info2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * Legt den Wert der info2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * Ruft den Wert der returns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturns() {
        return returns;
    }

    /**
     * Legt den Wert der returns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturns(Boolean value) {
        this.returns = value;
    }

}
