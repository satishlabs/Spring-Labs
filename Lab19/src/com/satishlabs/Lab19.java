package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab19 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		System.out.println("---- Spring Container is Now Read -----");
		Hello hello = (Hello)ctx.getBean("hello");
		hello.show();	}
}
