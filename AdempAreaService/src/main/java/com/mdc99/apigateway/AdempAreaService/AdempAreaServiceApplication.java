package com.mdc99.apigateway.AdempAreaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdempAreaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdempAreaServiceApplication.class, args);
	}

}
