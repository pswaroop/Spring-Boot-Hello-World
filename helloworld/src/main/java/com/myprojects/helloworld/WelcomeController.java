package com.myprojects.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/home")
	public String home() {	
		return "<center><h1>Welcome to my First sample Spring boot App</h1></center>";
	}
	

}
