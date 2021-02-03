package com.mdc99.apigateway.AdempAreaService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdemp {
	
	@GetMapping("/ademp/message")
	public String getMessage() {
		return "Hello from ADEMP AREA SERVICE";
	}
}
