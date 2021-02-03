package com.mdc99.apigateway.ClaimsAreaService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClaims {

	@GetMapping("/claims/message")
	public String getMessage() {
		return "Hello from CLAIMS AREA SERVICE";
	}
}
