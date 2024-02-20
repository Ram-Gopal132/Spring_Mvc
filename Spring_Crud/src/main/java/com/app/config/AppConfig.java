package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Controller
@EnableWebMvc
@ComponentScan(basePackages = {"com.app"})
public class AppConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver resolver()
	
	{
		InternalResourceViewResolver myResolver=new InternalResourceViewResolver();
		myResolver.setViewClass(JstlView.class);
		myResolver.setPrefix("/WEB-INF/views/");
		myResolver.setSuffix(".jsp");
		return myResolver;
	}
	
}


