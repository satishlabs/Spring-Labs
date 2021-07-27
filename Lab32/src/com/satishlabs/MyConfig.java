package com.satishlabs;

import org.springframework.config.java.annotation.Bean;
import org.springframework.config.java.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class MyConfig {
	public MyConfig() {
		System.out.println("Spring container is now getting Ready");
	}
	
	@Bean(name="hello")
	public Hello getHello() {
		System.out.println("getHello()");
		return new Hello();
	}
	
	@Bean(name="ao")
	public A getA() {
		A obj = new A();
		obj.setA(99);
		obj.setStr("Satish");
		return obj;
		}
	
	@Bean(name="bo")
	public B getB() {
		B obj = new B(88, "Manish");
		return obj;
	}
}
