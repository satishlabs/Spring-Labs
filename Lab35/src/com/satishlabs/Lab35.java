package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab35 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerService cs = (CustomerService) ctx.getBean("cs");
		cs.addCustomer();
		cs.updateCustomer();
		
		AccountService as = (AccountService) ctx.getBean("as");
		as.mydeposit();
		as.getBal();
		try {
			as.mywithdrow();
		}catch (Exception e) {
			System.out.println("Sorry ----");
			System.out.println(e);
		}
	}
}
