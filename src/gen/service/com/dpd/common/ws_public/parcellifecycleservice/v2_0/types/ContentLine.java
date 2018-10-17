
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains one text line and information about how the text has to be displayed.
 * 
 * <p>Java-Klasse für ContentLine complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bold" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="paragraph" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentLine", propOrder = {
    "content",
    "bold",
    "paragraph"
})
public class ContentLine {

    @XmlElement(required = true)
    protected String content;
    protected boolean bold;
    protected boolean paragraph;

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
     * Ruft den Wert der bold-Eigenschaft ab.
     * 
     */
    public boolean isBold() {
        return bold;
    }

    /**
     * Legt den Wert der bold-Eigenschaft fest.
     * 
     */
    public void setBold(boolean value) {
        this.bold = value;
    }

    /**
     * Ruft den Wert der paragraph-Eigenschaft ab.
     * 
     */
    public boolean isParagraph() {
        return paragraph;
    }

    /**
     * Legt den Wert der paragraph-Eigenschaft fest.
     * 
     */
    public void setParagraph(boolean value) {
        this.paragraph = value;
    }

}
