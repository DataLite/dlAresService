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
 * <p>Java class for odpoved_OR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_OR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="E" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}error_ARES" minOccurs="0"/&gt;
 *         &lt;element name="VH" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vysledek_hledani"/&gt;
 *         &lt;element name="PZA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Vypis_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vypis_OR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_OR", propOrder = {
    "pid",
    "e",
    "vh",
    "pza",
    "vypisOR"
})
public class OdpovedOR {

    @XmlElement(name = "PID")
    protected int pid;
    @XmlElement(name = "E")
    protected ErrorARES e;
    @XmlElement(name = "VH", required = true)
    protected VysledekHledani vh;
    @XmlElement(name = "PZA")
    protected int pza;
    @XmlElement(name = "Vypis_OR")
    protected List<VypisOR> vypisOR;

    /**
     * Gets the value of the pid property.
     * 
     */
    public int getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     */
    public void setPID(int value) {
        this.pid = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES }
     *     
     */
    public ErrorARES getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES }
     *     
     */
    public void setE(ErrorARES value) {
        this.e = value;
    }

    /**
     * Gets the value of the vh property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekHledani }
     *     
     */
    public VysledekHledani getVH() {
        return vh;
    }

    /**
     * Sets the value of the vh property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekHledani }
     *     
     */
    public void setVH(VysledekHledani value) {
        this.vh = value;
    }

    /**
     * Gets the value of the pza property.
     * 
     */
    public int getPZA() {
        return pza;
    }

    /**
     * Sets the value of the pza property.
     * 
     */
    public void setPZA(int value) {
        this.pza = value;
    }

    /**
     * Gets the value of the vypisOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vypisOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVypisOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VypisOR }
     * 
     * 
     */
    public List<VypisOR> getVypisOR() {
        if (vypisOR == null) {
            vypisOR = new ArrayList<VypisOR>();
        }
        return this.vypisOR;
    }

}
