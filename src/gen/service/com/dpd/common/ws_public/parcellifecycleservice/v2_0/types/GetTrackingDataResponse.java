
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response object of method getTrackingData.
 * 
 * <p>Java-Klasse für getTrackingDataResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getTrackingDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trackingresult" type="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}TrackingResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTrackingDataResponse", propOrder = {
    "trackingresult"
})
public class GetTrackingDataResponse {

    @XmlElement(required = true)
    protected TrackingResult trackingresult;

    /**
     * Ruft den Wert der trackingresult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrackingResult }
     *     
     */
    public TrackingResult getTrackingresult() {
        return trackingresult;
    }

    /**
     * Legt den Wert der trackingresult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingResult }
     *     
     */
    public void setTrackingresult(TrackingResult value) {
        this.trackingresult = value;
    }

}
