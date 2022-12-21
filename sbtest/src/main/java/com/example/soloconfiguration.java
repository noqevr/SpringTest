package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class soloconfiguration {
	
	
	@Bean
	public solo solo() {
	solo so=new solo();	
	so.setHowlong(5);
	so.setName("js");
	return so;
	}

}
