//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.03 a las 07:33:06 PM CST 
//


package io.spring.guides.gs_producing_web_service;

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
 *         &lt;element name="lengua" type="{http://spring.io/guides/gs-producing-web-service}lengua"/&gt;
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
    "lengua"
})
@XmlRootElement(name = "getLenguaResponse")
public class GetLenguaResponse {

    @XmlElement(required = true)
    protected Lengua lengua;

    /**
     * Obtiene el valor de la propiedad lengua.
     * 
     * @return
     *     possible object is
     *     {@link Lengua }
     *     
     */
    public Lengua getLengua() {
        return lengua;
    }

    /**
     * Define el valor de la propiedad lengua.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengua }
     *     
     */
    public void setLengua(Lengua value) {
        this.lengua = value;
    }

}
