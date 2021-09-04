package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satishlabs.jdbc.TestService;

public class Lab40 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		TestService ts = (TestService) ctx.getBean("ts");
		ts.showOracleInfo();
		ts.showMySQLInfo();
	}
}
