package com.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class mycontroller {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "index";
	}
	

}