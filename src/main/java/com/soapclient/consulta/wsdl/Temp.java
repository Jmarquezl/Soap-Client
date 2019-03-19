//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.18 a las 10:35:49 PM CST 
//


package com.soapclient.consulta.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para temp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="temp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MorningLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaytimeHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temp", propOrder = {
    "morningLow",
    "daytimeHigh"
})
public class Temp {

    @XmlElement(name = "MorningLow")
    protected String morningLow;
    @XmlElement(name = "DaytimeHigh")
    protected String daytimeHigh;

    /**
     * Obtiene el valor de la propiedad morningLow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorningLow() {
        return morningLow;
    }

    /**
     * Define el valor de la propiedad morningLow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorningLow(String value) {
        this.morningLow = value;
    }

    /**
     * Obtiene el valor de la propiedad daytimeHigh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaytimeHigh() {
        return daytimeHigh;
    }

    /**
     * Define el valor de la propiedad daytimeHigh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaytimeHigh(String value) {
        this.daytimeHigh = value;
    }

}
