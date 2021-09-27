package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab46 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. Add Customer
		CustomerTO cto = new CustomerTO(109, "Testee", "test111@g", 1010, "Delhi");
		cdao.addCustomer(cto);
		System.out.println("Call Complete");
	}
}
