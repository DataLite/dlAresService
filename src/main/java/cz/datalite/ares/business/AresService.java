package cz.datalite.ares.business;

/**
 * Servisa pro dotahoni dat pomoci ares ws
 */
public interface AresService {

	AresInfo getAresInfo(String regNo, String requestAddress);

}
