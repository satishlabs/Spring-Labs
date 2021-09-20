package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab45 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. Add Customer
		CustomerTO cto = new CustomerTO(301, "Test", "test@gmail", 9999, "Test City");
		cdao.addCustomer(cto);
	}
}
