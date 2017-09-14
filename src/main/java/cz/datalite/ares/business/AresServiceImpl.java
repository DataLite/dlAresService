package cz.datalite.ares.business;


import cz.datalite.ares.ws.ares.basic.AresOdpovedi;
import cz.datalite.ares.ws.ares.basic.VypisBasic;
import cz.datalite.helpers.StringHelper;
import cz.datalite.stereotype.Service;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;

@Service
public class AresServiceImpl implements AresService {

	private static final Logger logger = LoggerFactory.getLogger(AresServiceImpl.class);


	@Override
	public AresInfo getAresInfo(String regNo, String requestAddress) {

		if(StringHelper.isNull(requestAddress)){
			throw new AresException("Request address is not specified.");
		}

//		HttpClient

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet aresRequest = new HttpGet(requestAddress+regNo);

		try {
			HttpResponse response = client.execute(aresRequest);

			int responseStatus = response.getStatusLine().getStatusCode();

			if(HttpStatus.SC_OK != responseStatus){
				throw new AresException(String.format("Connection failed. Response status - %d", responseStatus));
			}

			//String xmlResponse = IOUtils.toString(response.getEntity().getContent());

			Unmarshaller unmarshaller = JAXBContext.newInstance(AresOdpovedi.class).createUnmarshaller();
			AresOdpovedi odpovedi = (AresOdpovedi) unmarshaller.unmarshal(response.getEntity().getContent());
			EntityUtils.consume(response.getEntity());

			if(odpovedi.getFault() != null){
				throw new AresException(String.format("Ares returned fault, %s - %s", odpovedi.getFault().getFaultcode(), odpovedi.getFault().getFaultstring()));
			}

			if(odpovedi.getOdpovedPocet() != 1){
				throw new AresException(String.format("Unexpected number of answers - %d", odpovedi.getOdpovedPocet()));
			}

			VypisBasic vypis = odpovedi.getOdpoved().get(0).getVBAS().get(0);

			return AresInfo.createFromResponse(vypis);

		} catch (IOException | JAXBException e) {
			throw  new AresException(e);
		}

	}
}
