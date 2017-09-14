package cz.datalite.ares.business;

import cz.datalite.ares.ws.ares.basic.VypisBasic;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AresInfo {


	/** DIC */
	private String fiscNo;
	/** Firma, OF */
	private String name;
	/** Ulice, NU) */
	private String street;
	/** Nazev casti obce, NCO */
	private String townPart;
	/** Cislo domovni CD */
	private String streetNo;
	/** Cislo orientacni CO */
	private String houseNo;
	/** Nazev obce, N */
	private String town;
	/** Nazev mestske casti, NMC */
	private String cityPart;
	/** PSC, PSC */
	private String postCd;
	/** Nazev PF, NPF */
	private String legalForm;

	public static AresInfo createFromResponse(VypisBasic vypis){
		AresInfo info = new AresInfo();
		info.setFiscNo(vypis.getDIC().getValue());
		info.setName(vypis.getOF().getValue());
		info.setStreet(vypis.getAA().getNU());
		info.setTownPart(vypis.getAA().getNCO());
		info.setStreetNo(vypis.getAA().getCD().toString());
		info.setHouseNo(vypis.getAA().getCO());
		info.setTown(vypis.getAA().getN());
		info.setCityPart(vypis.getAA().getNMC());
		info.setPostCd(vypis.getAA().getPSC());
		info.setLegalForm(vypis.getPF().getNPF());
		return info;
	}

	public String getFiscNo() {
		return fiscNo;
	}

	public void setFiscNo(String fiscNo) {
		this.fiscNo = fiscNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTownPart() {
		return townPart;
	}

	public void setTownPart(String townPart) {
		this.townPart = townPart;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCityPart() {
		return cityPart;
	}

	public void setCityPart(String cityPart) {
		this.cityPart = cityPart;
	}

	public String getPostCd() {
		return postCd;
	}

	public void setPostCd(String postCd) {
		this.postCd = postCd;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("fiscNo", fiscNo)
				.append("name", name)
				.append("street", street)
				.append("townPart", townPart)
				.append("streetNo", streetNo)
				.append("houseNo", houseNo)
				.append("town", town)
				.append("cityPart", cityPart)
				.append("postCd", postCd)
				.append("legalForm", legalForm)
				.toString();
	}
}
