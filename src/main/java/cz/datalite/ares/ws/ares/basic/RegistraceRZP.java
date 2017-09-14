//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.*;


/**
 * Údaje o registraci subjektu
 * 
 * <p>Java class for registrace_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrace_RZP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zivnostensky_urad" minOccurs="0"/&gt;
 *         &lt;element name="VJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}financni_urad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="aktivni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ano_ne" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrace_RZP", propOrder = {
    "zu",
    "vj",
    "or",
    "fu"
})
public class RegistraceRZP {

    @XmlElement(name = "ZU")
    protected ZivnostenskyUrad zu;
    @XmlElement(name = "VJ")
    protected String vj;
    @XmlElement(name = "OR")
    protected String or;
    @XmlElement(name = "FU")
    protected FinancniUrad fu;
    @XmlAttribute(name = "aktivni")
    protected String aktivni;

    /**
     * Gets the value of the zu property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostenskyUrad }
     *     
     */
    public ZivnostenskyUrad getZU() {
        return zu;
    }

    /**
     * Sets the value of the zu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostenskyUrad }
     *     
     */
    public void setZU(ZivnostenskyUrad value) {
        this.zu = value;
    }

    /**
     * Gets the value of the vj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVJ() {
        return vj;
    }

    /**
     * Sets the value of the vj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVJ(String value) {
        this.vj = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOR() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOR(String value) {
        this.or = value;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFU(FinancniUrad value) {
        this.fu = value;
    }

    /**
     * Gets the value of the aktivni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivni() {
        return aktivni;
    }

    /**
     * Sets the value of the aktivni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivni(String value) {
        this.aktivni = value;
    }

}
