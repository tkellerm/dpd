
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für storeOrdersResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="storeOrdersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderResult" type="{http://dpd.com/common/service/types/ShipmentService/3.2}storeOrdersResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrdersResponse", propOrder = {
    "orderResult"
})
public class StoreOrdersResponse {

    @XmlElement(required = true)
    protected StoreOrdersResponseType orderResult;

    /**
     * Ruft den Wert der orderResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StoreOrdersResponseType }
     *     
     */
    public StoreOrdersResponseType getOrderResult() {
        return orderResult;
    }

    /**
     * Legt den Wert der orderResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOrdersResponseType }
     *     
     */
    public void setOrderResult(StoreOrdersResponseType value) {
        this.orderResult = value;
    }

}
