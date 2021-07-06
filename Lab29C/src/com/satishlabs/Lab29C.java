package com.satishlabs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab29C {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class,HaiConfig.class);
		System.out.println("Now Spring Container is ready");
		
		ctx.scan("com.satishlabs");
		
		Hello hello = ctx.getBean(Hello.class);
		hello.show();
		
		Hai hai = ctx.getBean(Hai.class);
		hai.show();
	}
}
