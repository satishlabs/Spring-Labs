package com.satishlabs;

import org.springframework.config.java.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HelloConfig {
	
	@Bean(name = "hello")
	public Hello getHello() {
		System.out.println("getHello()");
		return new Hello();
	}
	
}
