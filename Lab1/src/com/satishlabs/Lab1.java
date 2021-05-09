package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		//Without IOC
		/*
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Satish");
		
		B bobj = new B(99, "Hai Satish");
		
		Hello hello = new Hello(bobj);
		hello.setAobj(aobj);
		hello.show();
		*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		System.out.println("Spring Container is Read");
		System.out.println("---------------------------");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
