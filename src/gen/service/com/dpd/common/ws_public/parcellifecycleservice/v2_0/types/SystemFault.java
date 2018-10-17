
package com.dpd.common.ws_public.parcellifecycleservice.v2_0.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Is thrown if an internal system fault occurs.
 *          
 * 
 * <p>Java-Klasse für SystemFault complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SystemFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dpd.com/common/service/types/ParcelLifeCycleService/2.0}Fault"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemFault")
public class SystemFault
    extends Fault
{


}
