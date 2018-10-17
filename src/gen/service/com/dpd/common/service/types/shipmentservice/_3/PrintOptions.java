
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Options how to return the parcel labels
 * 
 * <p>Java-Klasse für printOptions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="printOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="printerLanguage"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PDF"/&gt;
 *               &lt;enumeration value="ZPL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paperFormat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A4"/&gt;
 *               &lt;enumeration value="A6"/&gt;
 *               &lt;enumeration value="A7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="printer" type="{http://dpd.com/common/service/types/ShipmentService/3.2}printer" minOccurs="0"/&gt;
 *         &lt;element name="startPosition" type="{http://dpd.com/common/service/types/ShipmentService/3.2}startPosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "printOptions", propOrder = {
    "printerLanguage",
    "paperFormat",
    "printer",
    "startPosition"
})
public class PrintOptions {

    @XmlElement(required = true)
    protected String printerLanguage;
    @XmlElement(required = true)
    protected String paperFormat;
    protected Printer printer;
    @XmlSchemaType(name = "string")
    protected StartPosition startPosition;

    /**
     * Ruft den Wert der printerLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterLanguage() {
        return printerLanguage;
    }

    /**
     * Legt den Wert der printerLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterLanguage(String value) {
        this.printerLanguage = value;
    }

    /**
     * Ruft den Wert der paperFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaperFormat() {
        return paperFormat;
    }

    /**
     * Legt den Wert der paperFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaperFormat(String value) {
        this.paperFormat = value;
    }

    /**
     * Ruft den Wert der printer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Printer }
     *     
     */
    public Printer getPrinter() {
        return printer;
    }

    /**
     * Legt den Wert der printer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Printer }
     *     
     */
    public void setPrinter(Printer value) {
        this.printer = value;
    }

    /**
     * Ruft den Wert der startPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StartPosition }
     *     
     */
    public StartPosition getStartPosition() {
        return startPosition;
    }

    /**
     * Legt den Wert der startPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StartPosition }
     *     
     */
    public void setStartPosition(StartPosition value) {
        this.startPosition = value;
    }

}
