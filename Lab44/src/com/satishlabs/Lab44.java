package com.satishlabs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab44 {
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

				//3. Get Customer By Email
				System.out.println("Get Customers by Email");
				cto = cdao.getCustomerByEmail("man@gmail");
				System.out.println(cto);

				//4.Get Customer By City
				System.out.println("Get Customers by City");
				list = cdao.getCustomerByCity("Patna");
				System.out.println(list);

				//5. Get Customer Count
				System.out.println("Get Customer count");
				int count = cdao.getCustomersCount();
				System.out.println("No of Cust: "+count);


				//6. Get Customer City by Email
				System.out.println("Get Customer City by Email");
				String ci = cdao.getCustomerCityByEmail("sat@gmail");
				System.out.println(ci);

				//7. Get Customer Phone by Email
				System.out.println("Get Customer Phone by Email");
				long ph = cdao.getCustomerPhoneByEmail("sat@gmail");
				System.out.println(ph);
	}
}
