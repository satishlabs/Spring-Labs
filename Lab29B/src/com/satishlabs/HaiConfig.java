package com.satishlabs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HaiConfig {
	
	@Bean(name = "hai")
	public Hai getHai() {
		System.out.println("getHai()");
		return new Hai();
	}
	
	
	
}
