package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab41 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//Add Customer
		CustomerTO cto = new CustomerTO(103, "Mantu", "man@gmail", 3333, "Patna");
		cdao.addCustomer(cto);
		
		//2. Update Customer
		CustomerTO cto1 = new CustomerTO(102, "Kaushik", "man@gmail", 010101, "Patna");
		cdao.updateCustomer(cto1);
		
		//3. Delete Customer
		cdao.deleteCustomer(103);
		System.out.println("Check your database");
	}
}
