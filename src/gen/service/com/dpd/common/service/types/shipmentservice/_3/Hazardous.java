
package com.dpd.common.service.types.shipmentservice._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Bundles hazardous materials data.
 * 
 * <p>Java-Klasse für hazardous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="hazardous"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationUnNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identificationClass"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="classificationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="packingGroup" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="packingCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="0A"/&gt;
 *               &lt;enumeration value="0A1"/&gt;
 *               &lt;enumeration value="0A2"/&gt;
 *               &lt;enumeration value="1A"/&gt;
 *               &lt;enumeration value="1A1"/&gt;
 *               &lt;enumeration value="1A2"/&gt;
 *               &lt;enumeration value="1B"/&gt;
 *               &lt;enumeration value="1B1"/&gt;
 *               &lt;enumeration value="1B2"/&gt;
 *               &lt;enumeration value="1H"/&gt;
 *               &lt;enumeration value="1H1"/&gt;
 *               &lt;enumeration value="1H2"/&gt;
 *               &lt;enumeration value="3A"/&gt;
 *               &lt;enumeration value="3A1"/&gt;
 *               &lt;enumeration value="3A2"/&gt;
 *               &lt;enumeration value="3B"/&gt;
 *               &lt;enumeration value="3B1"/&gt;
 *               &lt;enumeration value="3B2"/&gt;
 *               &lt;enumeration value="3H"/&gt;
 *               &lt;enumeration value="3H1"/&gt;
 *               &lt;enumeration value="3H2"/&gt;
 *               &lt;enumeration value="4A"/&gt;
 *               &lt;enumeration value="4B"/&gt;
 *               &lt;enumeration value="4D"/&gt;
 *               &lt;enumeration value="4G"/&gt;
 *               &lt;enumeration value="4H"/&gt;
 *               &lt;enumeration value="4H1"/&gt;
 *               &lt;enumeration value="4H2"/&gt;
 *               &lt;enumeration value="5H"/&gt;
 *               &lt;enumeration value="5M"/&gt;
 *               &lt;enumeration value="6H"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="description"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="160"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subsidiaryRisk" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tunnelRestrictionCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="B"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hazardousWeight"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *               &lt;totalDigits value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="netWeight" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *               &lt;totalDigits value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="factor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="notOtherwiseSpecified" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hazardous", propOrder = {
    "identificationUnNo",
    "identificationClass",
    "classificationCode",
    "packingGroup",
    "packingCode",
    "description",
    "subsidiaryRisk",
    "tunnelRestrictionCode",
    "hazardousWeight",
    "netWeight",
    "factor",
    "notOtherwiseSpecified"
})
public class Hazardous {

    @XmlElement(required = true)
    protected String identificationUnNo;
    @XmlElement(required = true)
    protected String identificationClass;
    protected String classificationCode;
    protected String packingGroup;
    @XmlElement(required = true)
    protected String packingCode;
    @XmlElement(required = true)
    protected String description;
    protected String subsidiaryRisk;
    protected String tunnelRestrictionCode;
    @XmlElement(required = true)
    protected BigDecimal hazardousWeight;
    protected BigDecimal netWeight;
    protected int factor;
    protected String notOtherwiseSpecified;

    /**
     * Ruft den Wert der identificationUnNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationUnNo() {
        return identificationUnNo;
    }

    /**
     * Legt den Wert der identificationUnNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationUnNo(String value) {
        this.identificationUnNo = value;
    }

    /**
     * Ruft den Wert der identificationClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationClass() {
        return identificationClass;
    }

    /**
     * Legt den Wert der identificationClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationClass(String value) {
        this.identificationClass = value;
    }

    /**
     * Ruft den Wert der classificationCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * Legt den Wert der classificationCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * Ruft den Wert der packingGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingGroup() {
        return packingGroup;
    }

    /**
     * Legt den Wert der packingGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingGroup(String value) {
        this.packingGroup = value;
    }

    /**
     * Ruft den Wert der packingCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingCode() {
        return packingCode;
    }

    /**
     * Legt den Wert der packingCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingCode(String value) {
        this.packingCode = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der subsidiaryRisk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidiaryRisk() {
        return subsidiaryRisk;
    }

    /**
     * Legt den Wert der subsidiaryRisk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidiaryRisk(String value) {
        this.subsidiaryRisk = value;
    }

    /**
     * Ruft den Wert der tunnelRestrictionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }

    /**
     * Legt den Wert der tunnelRestrictionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelRestrictionCode(String value) {
        this.tunnelRestrictionCode = value;
    }

    /**
     * Ruft den Wert der hazardousWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHazardousWeight() {
        return hazardousWeight;
    }

    /**
     * Legt den Wert der hazardousWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHazardousWeight(BigDecimal value) {
        this.hazardousWeight = value;
    }

    /**
     * Ruft den Wert der netWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Legt den Wert der netWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeight(BigDecimal value) {
        this.netWeight = value;
    }

    /**
     * Ruft den Wert der factor-Eigenschaft ab.
     * 
     */
    public int getFactor() {
        return factor;
    }

    /**
     * Legt den Wert der factor-Eigenschaft fest.
     * 
     */
    public void setFactor(int value) {
        this.factor = value;
    }

    /**
     * Ruft den Wert der notOtherwiseSpecified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotOtherwiseSpecified() {
        return notOtherwiseSpecified;
    }

    /**
     * Legt den Wert der notOtherwiseSpecified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotOtherwiseSpecified(String value) {
        this.notOtherwiseSpecified = value;
    }

}
