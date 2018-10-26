package com.scp.spring.demo.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String m1(){
		return "Welcome to the spring boot...";
	}
}
