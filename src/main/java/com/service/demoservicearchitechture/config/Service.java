package com.service.demoservicearchitechture.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class Service {
	@Override
	public String toString() {
		return "service [data=" + data + "]";
	}

	public DataCofig getData() {
		return data;
	}

	public void setData(DataCofig data) {
		this.data = data;
	}

	private DataCofig data;
}
