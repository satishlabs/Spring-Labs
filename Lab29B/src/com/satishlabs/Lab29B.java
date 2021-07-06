package com.satishlabs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab29B {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class,HaiConfig.class);
		System.out.println("Now Spring Container is ready");
		
		ctx.getBean(HelloConfig.class);
		ctx.getBean(HaiConfig.class);
		ctx.refresh();
		
		Hello hello = ctx.getBean(Hello.class);
		hello.show();
		
		Hai hai = ctx.getBean(Hai.class);
		hai.show();
	}
}
