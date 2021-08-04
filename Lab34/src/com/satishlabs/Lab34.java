package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab34 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		System.out.println("-- Using Target object");
		
		CustomerService cs = (CustomerService) ctx.getBean("csTarget");
		cs.addCustomer();
		cs.updateCustomer();
		System.out.println("-------------- Account Service ------------------");
		AccountService as = (AccountService) ctx.getBean("asTarget");
		as.mydeposit();
		as.getBal();
		try {
			as.mywithdrow();
		}catch (Exception e) {
			System.out.println("Sorry ---");
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------- Using Proxy Object ---------------");
		
		CustomerService csp = (CustomerService) ctx.getBean("csProxy");
		csp.addCustomer();
		csp.updateCustomer();
		
		System.out.println("-------------- Account Service Proxy------------------");
		AccountService asp = (AccountService) ctx.getBean("asProxy");
		asp.mydeposit();
		asp.getBal();
		try {
			asp.mywithdrow();
		}catch (Exception e) {
			System.out.println("Sorry ---");
		}
	}
}
  