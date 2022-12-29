package com.springBootDev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/getTestMessage")
	public String getTestMessage() {
		return "this is a test message";
	}

}
