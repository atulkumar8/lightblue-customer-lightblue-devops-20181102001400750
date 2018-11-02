package org.cts.com.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Q014787
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SmuMessageSelector implements Serializable {
	private static final long serialVersionUID = 1L;
	private final Selector selector = new Selector();
	private List<String> fields = new ArrayList<String>();

	public static class Selector {
		private MessageCode messageCode = new MessageCode();

		public static class MessageCode {
			private String $eq;

			public String get$eq() {
				return $eq;
			}

			public void set$eq(String $eq) {
				this.$eq = $eq;
			}
		}

		public MessageCode getMessageCode() {
			return messageCode;
		}

		public void setMessageCode(MessageCode messageCode) {
			this.messageCode = messageCode;
		}
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> list) {
		this.fields = list;
	}

	public Selector getSelector() {
		return selector;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SmuMessageSelector [selector=");
		builder.append(selector);
		builder.append(", fields=");
		builder.append(fields);
		builder.append("]");
		return builder.toString();
	}
}
