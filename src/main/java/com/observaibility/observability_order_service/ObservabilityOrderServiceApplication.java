package com.observaibility.observability_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ObservabilityOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservabilityOrderServiceApplication.class, args);
	}

}
