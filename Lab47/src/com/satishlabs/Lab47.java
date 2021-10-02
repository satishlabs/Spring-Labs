package com.satishlabs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab47 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		//1. Add Customer
		System.out.println("Add New Customer");
		CustomerTO cto = new CustomerTO(401, "KumarTest", "kt@gmail", 98989, "Patna");
		cdao.addCustomer(cto);
		
		//2. Update Customer
		System.out.println("Update Customer by Cid");
		CustomerTO cto1=new CustomerTO(203, "PriyaC", "pc@gmail", 10201, "Jamshedpur");
		cdao.updateCustomer(cto1);
		
		//3. delete Customer
		System.out.println("Delete Customer by Cid");
		cdao.deleteCustomer(102);
		
		//4. Get All Customers
		System.out.println("Get All Customers");
		List<CustomerTO> list = cdao.getAllCustomers();
		for(CustomerTO ct:list) {
			System.out.println(ct);
		}
		
		//5. Get Customer By Cid
		System.out.println("Get Customers By Cid");
		CustomerTO cto2 = cdao.getCustomerByCid(103);
		System.out.println(cto2);
	}
}
