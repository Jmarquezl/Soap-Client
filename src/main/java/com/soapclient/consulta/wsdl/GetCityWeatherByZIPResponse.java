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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCityWeatherByZIPResult" type="{http://ws.cdyne.com/WeatherWS/}WeatherReturn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCityWeatherByZIPResult"
})
@XmlRootElement(name = "GetCityWeatherByZIPResponse")
public class GetCityWeatherByZIPResponse {

    @XmlElement(name = "GetCityWeatherByZIPResult", required = true)
    protected WeatherReturn getCityWeatherByZIPResult;

    /**
     * Obtiene el valor de la propiedad getCityWeatherByZIPResult.
     * 
     * @return
     *     possible object is
     *     {@link WeatherReturn }
     *     
     */
    public WeatherReturn getGetCityWeatherByZIPResult() {
        return getCityWeatherByZIPResult;
    }

    /**
     * Define el valor de la propiedad getCityWeatherByZIPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherReturn }
     *     
     */
    public void setGetCityWeatherByZIPResult(WeatherReturn value) {
        this.getCityWeatherByZIPResult = value;
    }

}
