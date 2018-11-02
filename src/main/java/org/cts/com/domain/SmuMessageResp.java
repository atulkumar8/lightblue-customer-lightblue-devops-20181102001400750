package org.cts.com.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Q014787
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SmuMessageResp {
	CloudantPropertiesBean smuMessage;
	public CloudantPropertiesBean getSmuMessage() {
		return smuMessage;
	}
	public void setSmuMessage(CloudantPropertiesBean smuMessage) {
		this.smuMessage = smuMessage;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SmuMessageResp [smuMessage=");
		builder.append(smuMessage);
		builder.append("]");
		return builder.toString();
	}
}
