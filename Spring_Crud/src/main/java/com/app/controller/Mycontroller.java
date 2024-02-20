package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.w3c.dom.UserDataHandler;
import com.app.model.User;
@Controller
public class Mycontroller {

	@GetMapping("/showsignUp")
	public String showsignUp()
	{
		return "signup-form";
	}
	
	@ModelAttribute("user")
	public User getData()
	{
		return new User();
	}
	
	@PostMapping("/saveSign")
	public String afterSavingRecord(@ModelAttribute("user")User newUser,Model model)
	{
		System.out.println("-------------Record Inserted------------");
		System.out.println("Firstname:"+newUser.getFirstName());
		System.out.println("Lasttname:"+newUser.getLastName());
		System.out.println("Email:"+newUser.getEmail());
		System.out.println("Password:"+newUser.getPassword());
		
		model.addAttribute("message","Record Save");
		model.addAttribute("userData",newUser);
		return "signup-sucess";
		
	}
}
