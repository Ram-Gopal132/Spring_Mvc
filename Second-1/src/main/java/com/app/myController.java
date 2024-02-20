package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.repo.UserRepositry;


@RestController
public class myController {
	
	@Autowired
	UserRepositry userRepository;
	
	@GetMapping("/hello")
	public String helloworld(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "hello";
	}
	

}
