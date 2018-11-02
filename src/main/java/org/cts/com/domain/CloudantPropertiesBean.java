package org.cts.com.domain;

/**
 * @author Q014787
 *
 */
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
//@ConfigurationProperties(prefix="spring.cloudant")
public class CloudantPropertiesBean{
	
	private String username= "c7f097a9-1b39-44b2-b79b-2ae6e8be8140-bluemix";
	private String password ="4851f59a188ee6494c427d1f6fc8d767270bd65bc487b752d70315f021f2ac44";
	private String host="c7f097a9-1b39-44b2-b79b-2ae6e8be8140-bluemix.cloudant.com";
	private String protocol="https";
	private String port="443";
	private String database = "customers";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}

}
