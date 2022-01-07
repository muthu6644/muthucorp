package com.org.muthucorp.controller;

import javax.annotation.Generated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("/health")
	public  String getHealth() {
		
		System.out.println("Customer service health check fine...);
		return "ok";
	}

}
