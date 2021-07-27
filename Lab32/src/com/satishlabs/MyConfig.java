package com.satishlabs;

import org.springframework.config.java.annotation.Bean;
import org.springframework.config.java.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("satish.xml")
public class MyConfig {
	public MyConfig() {
		System.out.println("Spring container is now getting Ready");
	}
	
	@Bean(name="hello")
	public Hello getHello() {
		System.out.println("getHello()");
		return new Hello();
	}
}
