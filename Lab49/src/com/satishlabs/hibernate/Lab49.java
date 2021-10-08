package com.satishlabs.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab49 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerDAO cdao =(CustomerDAO) ctx.getBean("cdao");
		
		//1. Get all Customers
		System.out.println("Get All Customers");
		List<CustomerTO> list = cdao.getAllCustomers();
		for(CustomerTO ct:list) {
			System.out.println(ct);
		}
		
		//2. Get Customer By Email
		System.out.println("Get Customer by Email");
		CustomerTO cto = cdao.getCustomerByEmail("satish@gmail");	
		System.out.println(cto);
		
		//3. Get Customer By City
		System.out.println("Get Customer by City");
		list = cdao.getCustomersByCity("Ranchi");
		for(CustomerTO c: list) {
			System.out.println(c);
		}
		
		//4. Get Customer Count
		System.out.println("Get Customer Counts");
		int count = cdao.getCustomersCount();
		System.out.println("No of cust: "+count);
		
		//5. Get Customer City by Email
		System.out.println("Get Customer City By Email");
		String ct = cdao.getCustomerCityByEmail("abc@gmail");
		System.out.println(ct);
		
		//6. Get Customer Phone by Email
		System.out.println("Get Customer Phone by EMail");
		Long cp = cdao.getCustomerPhoneByEmail("abc@gmail");
		System.out.println(cp);
	}
}
