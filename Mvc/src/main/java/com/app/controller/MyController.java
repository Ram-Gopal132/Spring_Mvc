package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.HelloWorld;

@Controller
public class MyController {
	
	@GetMapping("/Barrownz")
	
	public String sayHello(Model model)
	{
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.setMessage("Welcome For Spring MVc");
		model.addAttribute("hello",helloWorld);
		return "helloworld";
	}
	
	
@GetMapping("/Gopal")
	
	public String Hello(Model model)
	{
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.setMessage("Welcome To Ram Gopal");
		model.addAttribute("hello",helloWorld);
		return "helloworld";
	}

}