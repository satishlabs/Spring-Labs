package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab52 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satishlabs.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. Add Customer
		CustomerTO cto = new CustomerTO(202, "Test", "test@gmail", 12233, "Ranchi");
		cdao.addCustomer(cto);
		
		//2. Update Customer
		CustomerTO cto1 = new CustomerTO(202, "Test1", "Test@gmail", 9099, "Patna");
		cdao.updateCustomer(cto1);
		
		//3. delete Customer
		cdao.deleteCustomer(106);
		
		//4. get Customer by cid
		cto = cdao.getCustomerByCid(22);
		System.out.println(cto);
	}
}
