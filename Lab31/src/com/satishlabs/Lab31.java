package com.satishlabs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab31 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		Hello h = (Hello) ctx.getBean("hello");
		h.show();
	}
}
