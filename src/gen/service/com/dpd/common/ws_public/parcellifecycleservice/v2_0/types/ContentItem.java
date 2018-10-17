
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains multiple content lines.
 * 
 * <p>Java-Klasse für ContentItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="label" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentLine" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}ContentLine" maxOccurs="unbounded"/&gt;
 *         &lt;element name="linkTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentItem", propOrder = {
    "label",
    "content",
    "linkTarget"
})
public class ContentItem {

    protected ContentLine label;
    @XmlElement(required = true)
    protected List<ContentLine> content;
    protected String linkTarget;

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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentLine }
     * 
     * 
     */
    public List<ContentLine> getContent() {
        if (content == null) {
            content = new ArrayList<ContentLine>();
        }
        return this.content;
    }

    /**
     * Ruft den Wert der linkTarget-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTarget() {
        return linkTarget;
    }

    /**
     * Legt den Wert der linkTarget-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTarget(String value) {
        this.linkTarget = value;
    }

}
