package com.satishlabs;

import org.springframework.config.java.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class MyConfig {
	public MyConfig() {
		System.out.println("Spring Container is now getting Ready");
	}
	
	@Bean(name="hello",initMethod="myInit",destroyMethod="mycleanup")
	public Hello getHello() {
		System.out.println("getHello");
		return new Hello();
	}
}
