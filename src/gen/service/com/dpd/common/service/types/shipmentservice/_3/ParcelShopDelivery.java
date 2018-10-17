
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für parcelShopDelivery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parcelShopDelivery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parcelShopId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="parcelShopNotification" type="{http://dpd.com/common/service/types/ShipmentService/3.2}notification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcelShopDelivery", propOrder = {
    "parcelShopId",
    "parcelShopNotification"
})
public class ParcelShopDelivery {

    protected long parcelShopId;
    @XmlElement(required = true)
    protected Notification parcelShopNotification;

    /**
     * Ruft den Wert der parcelShopId-Eigenschaft ab.
     * 
     */
    public long getParcelShopId() {
        return parcelShopId;
    }

    /**
     * Legt den Wert der parcelShopId-Eigenschaft fest.
     * 
     */
    public void setParcelShopId(long value) {
        this.parcelShopId = value;
    }

    /**
     * Ruft den Wert der parcelShopNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getParcelShopNotification() {
        return parcelShopNotification;
    }

    /**
     * Legt den Wert der parcelShopNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setParcelShopNotification(Notification value) {
        this.parcelShopNotification = value;
    }

}
