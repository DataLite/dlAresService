//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Odpoved" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}odpoved_basic" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Fault" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}chybova_odpoved" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="odpoved_datum_cas" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="odpoved_pocet" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="odpoved_typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ares_dotaz_typ" fixed="Basic" /&gt;
 *       &lt;attribute name="vystup_format" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vystup_format" default="XML" /&gt;
 *       &lt;attribute name="xslt" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}xslt_ks" default="klient" /&gt;
 *       &lt;attribute name="validation_XSLT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "odpoved",
    "fault"
})
@XmlRootElement(name = "Ares_odpovedi", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer_basic/v_1.0.3")
public class AresOdpovedi {

    @XmlElement(name = "Odpoved", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer_basic/v_1.0.3", required = true)
    protected List<OdpovedBasic> odpoved;
    @XmlElement(name = "Fault", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer_basic/v_1.0.3")
    protected ChybovaOdpoved fault;
    @XmlAttribute(name = "odpoved_datum_cas", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar odpovedDatumCas;
    @XmlAttribute(name = "odpoved_pocet", required = true)
    protected int odpovedPocet;
    @XmlAttribute(name = "odpoved_typ")
    protected AresDotazTyp odpovedTyp;
    @XmlAttribute(name = "vystup_format")
    protected VystupFormat vystupFormat;
    @XmlAttribute(name = "xslt")
    protected XsltKs xslt;
    @XmlAttribute(name = "validation_XSLT")
    protected String validationXSLT;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the odpoved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odpoved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdpoved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdpovedBasic }
     * 
     * 
     */
    public List<OdpovedBasic> getOdpoved() {
        if (odpoved == null) {
            odpoved = new ArrayList<OdpovedBasic>();
        }
        return this.odpoved;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link ChybovaOdpoved }
     *     
     */
    public ChybovaOdpoved getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChybovaOdpoved }
     *     
     */
    public void setFault(ChybovaOdpoved value) {
        this.fault = value;
    }

    /**
     * Gets the value of the odpovedDatumCas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOdpovedDatumCas() {
        return odpovedDatumCas;
    }

    /**
     * Sets the value of the odpovedDatumCas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOdpovedDatumCas(XMLGregorianCalendar value) {
        this.odpovedDatumCas = value;
    }

    /**
     * Gets the value of the odpovedPocet property.
     * 
     */
    public int getOdpovedPocet() {
        return odpovedPocet;
    }

    /**
     * Sets the value of the odpovedPocet property.
     * 
     */
    public void setOdpovedPocet(int value) {
        this.odpovedPocet = value;
    }

    /**
     * Gets the value of the odpovedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link AresDotazTyp }
     *     
     */
    public AresDotazTyp getOdpovedTyp() {
        if (odpovedTyp == null) {
            return AresDotazTyp.BASIC;
        } else {
            return odpovedTyp;
        }
    }

    /**
     * Sets the value of the odpovedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AresDotazTyp }
     *     
     */
    public void setOdpovedTyp(AresDotazTyp value) {
        this.odpovedTyp = value;
    }

    /**
     * Gets the value of the vystupFormat property.
     * 
     * @return
     *     possible object is
     *     {@link VystupFormat }
     *     
     */
    public VystupFormat getVystupFormat() {
        if (vystupFormat == null) {
            return VystupFormat.XML;
        } else {
            return vystupFormat;
        }
    }

    /**
     * Sets the value of the vystupFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VystupFormat }
     *     
     */
    public void setVystupFormat(VystupFormat value) {
        this.vystupFormat = value;
    }

    /**
     * Gets the value of the xslt property.
     * 
     * @return
     *     possible object is
     *     {@link XsltKs }
     *     
     */
    public XsltKs getXslt() {
        if (xslt == null) {
            return XsltKs.KLIENT;
        } else {
            return xslt;
        }
    }

    /**
     * Sets the value of the xslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsltKs }
     *     
     */
    public void setXslt(XsltKs value) {
        this.xslt = value;
    }

    /**
     * Gets the value of the validationXSLT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationXSLT() {
        return validationXSLT;
    }

    /**
     * Sets the value of the validationXSLT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationXSLT(String value) {
        this.validationXSLT = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}