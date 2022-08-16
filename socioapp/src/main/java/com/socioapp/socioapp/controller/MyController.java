package com.socioapp.socioapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/Profile")
	public String profile() {
		
		return "Hello all";
		
	}
}
