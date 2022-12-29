package com.springBootDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevApplication {
	
	@GetMapping("/getTestMessage")
	public String getTestMessage() {
		return "this is a test message";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevApplication.class, args);
	}

}
