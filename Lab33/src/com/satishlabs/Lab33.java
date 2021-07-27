package com.satishlabs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab33 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		System.err.println("New Spring Container is Ready");
		Hello h = ctx.getBean(Hello.class);
		h.show();
		ctx.registerShutdownHook();
	}
}
