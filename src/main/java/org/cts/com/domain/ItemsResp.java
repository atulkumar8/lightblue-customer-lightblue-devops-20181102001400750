package org.cts.com.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Q014787
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsResp {
	private List<CloudantPropertiesBean> items;

	public List<CloudantPropertiesBean> getItems() {
		return items;
	}

	public void setItems(List<CloudantPropertiesBean> items) {
		this.items = items;
	}
}
