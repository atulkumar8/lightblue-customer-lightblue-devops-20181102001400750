package org.cts.com.config;

import java.net.MalformedURLException;
import java.net.URL;

import org.cts.com.domain.CloudantPropertiesBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
/**
 * @author Q014787
 * This is Java class that will used for cloudant connectivity and provide the cloudant database.
 *
 */
@Configuration
public class CloudantConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(CloudantConfiguration.class);
	
//	@Bean(name = { "database" })
//	public Database getDatabase() throws Exception {
////		try {
////			CloudantClient client = null;
////			URL url =new URL("https://799aa448-54e9-4e1b-ae9e-7f89c889a26f-bluemix:523f80d0ad554d568d02e0376c8de535f14435d61d020f8ec50ad00d122dca4f@799aa448-54e9-4e1b-ae9e-7f89c889a26f-bluemix.cloudant.com");
////			ClientBuilder.account("799aa448-54e9-4e1b-ae9e-7f89c889a26f-bluemix")
////					.username("799aa448-54e9-4e1b-ae9e-7f89c889a26f-bluemix")
////					.password("523f80d0ad554d568d02e0376c8de535f14435d61d020f8ec50ad00d122dca4f");
////			client = ClientBuilder.url(url).build();
////			logger.info("Cloudant Db connected successfully.");
////			return client.database("item", true);
////		} catch (CouchDbException e) {
////			throw new Exception("Unable to connect to DB", e);
////		} 
//	}
	
	//private Database cloudant;
//	@Autowired
//	private CloudantPropertiesBean cloudantProperties;
//
//	@Bean(name = { "database" })
//	public Database getDatabase()  throws MalformedURLException {
//		try {
//			String cldUrl = cloudantProperties.getProtocol() + "://" + cloudantProperties.getHost() + ":"
//					+ cloudantProperties.getPort();
//			logger.info("Connecting to cloudant at: " + cldUrl);
//			final CloudantClient cloudantClient = ClientBuilder.url(new URL(cldUrl))
//					.username(cloudantProperties.getUsername()).password(cloudantProperties.getPassword()).build();
//			Database cloudant = cloudantClient.database(cloudantProperties.getDatabase(), true);
//			return cloudant;
//		} catch (MalformedURLException e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//	}
}
