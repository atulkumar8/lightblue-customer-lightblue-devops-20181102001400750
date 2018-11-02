package org.cts.com.util;


import java.io.InputStream;

import org.cts.com.domain.ItemsResp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDataUtil {
	
	public static ItemsResp getTestData() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<ItemsResp> typeReference = new TypeReference<ItemsResp>() {};
		InputStream inputStream = TypeReference.class.getResourceAsStream("items.json");
		ItemsResp testData = mapper.readValue(inputStream, typeReference);
		return testData;
	}
}
