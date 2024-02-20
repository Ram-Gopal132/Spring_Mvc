package com.app.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.UserDataHandler;

import com.app.model.Customer;

import jakarta.validation.Valid;

@Controller

public class Mycontroller {
	
	@InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


	@GetMapping("/showCustomerForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "helloWorld";
	}
	
	@ModelAttribute("customer")
	public Customer getCustomer()
	{
		return new Customer();
	}
	
	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer")Customer theCustomer,BindingResult theBinding) 
	{
		if(theBinding.hasErrors()) {
			return "helloWorld";
		}
		else {
			return "customer-confirmation";
		}
		
	}

}
