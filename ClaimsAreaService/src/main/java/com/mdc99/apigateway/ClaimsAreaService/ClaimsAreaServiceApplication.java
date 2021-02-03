package com.mdc99.apigateway.ClaimsAreaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClaimsAreaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimsAreaServiceApplication.class, args);
	}

}
