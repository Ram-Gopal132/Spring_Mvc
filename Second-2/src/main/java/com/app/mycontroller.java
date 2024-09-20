package com.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class mycontroller {
	@GetMapping("/hi")
	public String hello() {
		return "hello";
	}
	

}
