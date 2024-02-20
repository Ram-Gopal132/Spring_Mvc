package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class MyController {
	
	@GetMapping("/customer")
	public String sayHello() {
	    return "customer-dataentry";
	}


}
