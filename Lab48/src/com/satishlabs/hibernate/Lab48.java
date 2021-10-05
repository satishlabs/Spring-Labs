package com.satishlabs.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab48 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerDAO cdao =(CustomerDAO) ctx.getBean("cdao");
		
		//1. Add Customer
		CustomerTO cto = new CustomerTO(401, "Srini", "srini@gmail", 1234, "PU");
		cdao.addCustomer(cto);
		
		//2. Update Customer
		CustomerTO cto1 = new CustomerTO(203, "Srini", "srini@gmail", 1234, "PU");
		cdao.updateCustomer(cto1);
		
		//3. delete Customer
		cdao.deleteCustomer(206); 
		
		//4. Get Customer By Cid
		System.out.println("Get Customer by Cid");
		cto = cdao.getCustomerByCid(301);
		System.out.println(cto);
		
	}
}
