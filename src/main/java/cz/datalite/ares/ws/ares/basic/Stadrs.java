//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Standardizace adres pro rejstříkové soudy opíše došlý dotaz a přidá k němu nalezenou odpověď
 * 
 * <p>Java class for stadrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stadrs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stadrs_dotaz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stadrs_dotaz"/&gt;
 *         &lt;element name="Stadrs_odpoved" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stadrs_odpoved"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stadrs", propOrder = {
    "stadrsDotaz",
    "stadrsOdpoved"
})
public class Stadrs {

    @XmlElement(name = "Stadrs_dotaz", required = true)
    protected StadrsDotaz stadrsDotaz;
    @XmlElement(name = "Stadrs_odpoved", required = true)
    protected StadrsOdpoved stadrsOdpoved;

    /**
     * Gets the value of the stadrsDotaz property.
     * 
     * @return
     *     possible object is
     *     {@link StadrsDotaz }
     *     
     */
    public StadrsDotaz getStadrsDotaz() {
        return stadrsDotaz;
    }

    /**
     * Sets the value of the stadrsDotaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StadrsDotaz }
     *     
     */
    public void setStadrsDotaz(StadrsDotaz value) {
        this.stadrsDotaz = value;
    }

    /**
     * Gets the value of the stadrsOdpoved property.
     * 
     * @return
     *     possible object is
     *     {@link StadrsOdpoved }
     *     
     */
    public StadrsOdpoved getStadrsOdpoved() {
        return stadrsOdpoved;
    }

    /**
     * Sets the value of the stadrsOdpoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link StadrsOdpoved }
     *     
     */
    public void setStadrsOdpoved(StadrsOdpoved value) {
        this.stadrsOdpoved = value;
    }

}
