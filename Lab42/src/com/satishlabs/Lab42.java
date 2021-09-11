package com.satishlabs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab42 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. Get All Customers
		System.out.println("Get All Customers");
		List<CustomerTO> list = cdao.getAllCustomers();
		for(CustomerTO ct: list) {
			System.out.println(ct);
		}
		
		//2. Get Customer by CustomerId
		System.out.println("Get Customer by CustomerId");
		CustomerTO cto= cdao.getCustomerByCid(102);
		System.out.println(cto);
	}
}
