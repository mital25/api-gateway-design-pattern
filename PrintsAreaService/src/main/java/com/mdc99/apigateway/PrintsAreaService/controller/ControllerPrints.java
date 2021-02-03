package com.mdc99.apigateway.PrintsAreaService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPrints {

	@GetMapping("/prints/message")
	public String getMessage() {
		return "Hello from PRINTS AREA SERVICE";
	}
}
