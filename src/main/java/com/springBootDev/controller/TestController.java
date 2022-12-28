package com.springBootDev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getTestMessage")
	public String getTestMessage() {
		return "this is a test message";
	}

}
