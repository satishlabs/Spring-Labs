package com.satishlabs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class MyConfig {
	public MyConfig() {
		System.out.println("Spring Container is now getting Ready");
	}
	@Bean(name = "hello")
	public Hello getHello() {
		System.out.println("getHello()");
		return new Hello();
	}
	
	@Bean(name = "hai")
	@Scope("prototype")
	public Hai getHai() {
		System.out.println("getHello()");
		return new Hai();
	}
}
