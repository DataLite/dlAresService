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
import java.util.ArrayList;
import java.util.List;


/**
 * Sekce údajů o konkurzech, vyrovnáních a zamítnutích konkurzů
 * 
 * <p>Java class for konkurzy_vyrovnani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="konkurzy_vyrovnani"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ukon" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="KKZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
 *                   &lt;element name="VY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
 *                   &lt;element name="ZAM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
 *                   &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "konkurzy_vyrovnani", propOrder = {
    "ukon"
})
public class KonkurzyVyrovnani {

    @XmlElement(name = "Ukon", required = true)
    protected List<KonkurzyVyrovnani.Ukon> ukon;

    /**
     * Gets the value of the ukon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUkon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KonkurzyVyrovnani.Ukon }
     * 
     * 
     */
    public List<KonkurzyVyrovnani.Ukon> getUkon() {
        if (ukon == null) {
            ukon = new ArrayList<KonkurzyVyrovnani.Ukon>();
        }
        return this.ukon;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="KKZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
     *         &lt;element name="VY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
     *         &lt;element name="ZAM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
     *         &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kkz",
        "vy",
        "zam",
        "insolvence"
    })
    public static class Ukon {

        @XmlElement(name = "KKZ")
        protected Konkurz kkz;
        @XmlElement(name = "VY")
        protected Konkurz vy;
        @XmlElement(name = "ZAM")
        protected Konkurz zam;
        @XmlElement(name = "Insolvence")
        protected Konkurz insolvence;

        /**
         * Gets the value of the kkz property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getKKZ() {
            return kkz;
        }

        /**
         * Sets the value of the kkz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setKKZ(Konkurz value) {
            this.kkz = value;
        }

        /**
         * Gets the value of the vy property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getVY() {
            return vy;
        }

        /**
         * Sets the value of the vy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setVY(Konkurz value) {
            this.vy = value;
        }

        /**
         * Gets the value of the zam property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getZAM() {
            return zam;
        }

        /**
         * Sets the value of the zam property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setZAM(Konkurz value) {
            this.zam = value;
        }

        /**
         * Gets the value of the insolvence property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getInsolvence() {
            return insolvence;
        }

        /**
         * Sets the value of the insolvence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setInsolvence(Konkurz value) {
            this.insolvence = value;
        }

    }

}
