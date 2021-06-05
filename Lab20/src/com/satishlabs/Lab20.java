package com.satishlabs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab20 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		
		System.out.println("Spring Container is Ready ...");
		System.out.println("-----------------------------");
		Hello hello = (Hello) ctx.getBean("HELLO");
		hello.show();
		
		System.out.println("-----------------------------");
		System.out.println("Spring Container going to Shutdown...");
		ctx.registerShutdownHook();
	}
}
