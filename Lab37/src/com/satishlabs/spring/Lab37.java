package com.satishlabs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Lab37 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerService cs = (CustomerService) ctx.getBean("cs");
		cs.addCustomer();
		System.out.println("----- ----");
		cs.updateCustomer();
		System.out.println("----- ----");
		
		AccountService as = (AccountService) ctx.getBean("as");
		as.mydeposit();
		System.out.println("----- ----");
		as.getBal();
		System.out.println("----- ----");
		try {
			as.mywithdrow();
		}catch (Exception e) {
			System.out.println("Sorry --- "+e);
		}
	}
}
