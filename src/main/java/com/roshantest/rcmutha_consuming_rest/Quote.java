package com.roshantest.rcmutha_consuming_rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private String type;
	private Data value;

	public Quote() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Quote{" + "type='" + type + '\'' + ", value=" + value + '}';
	}

	public Data getValue() {
		return value;
	}

	public void setValue(Data value) {
		this.value = value;
	}
}
