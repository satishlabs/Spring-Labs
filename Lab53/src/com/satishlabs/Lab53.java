package com.satishlabs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab53 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satishlabs.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. getAllCustoemrs
		System.out.println("GetAllCustomers");
		List<CustomerTO> list = cdao.getAllCustomers();
		for(CustomerTO c:list) {
			System.out.println(c);
		}
		
		//2. Get CustomerByEmail
		System.out.println("Get Customer Email");
		CustomerTO cto = cdao.getCustomerByEmail("sat@gmail");
		System.out.println(cto);
		
		//3. getCustomerByCity
		System.out.println("Get Customer by City");
		list = cdao.getCustomerByCity("Blore");
		for(CustomerTO c:list) {
			System.out.println(c);
		}
		
		//4. getCustomerCount
		int count = cdao.getCustomerCount();
		System.out.println("No of Cust : "+count);
		
		//5. get Customer City By Email
		String ci = cdao.getCustomerCityByEmail("sa@gmail");
		System.out.println(ci);
		
		//6. get Customer Phone by Email
		Long ph = cdao.getCustomerPhoneByEmail("sat@gmail");
		System.out.println(ph);
	}
}
