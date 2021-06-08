package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satishlabs.spring.Student;

public class Lab24 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		Student std = (Student) ctx.getBean("student");
		System.out.println(std.getSid().getBid());
		System.out.println(std.getSid().getSid());
		
		System.out.println(std.getSname());
		System.out.println(std.getPhone());
		System.out.println(std.getFee().getFeeBal());
		System.out.println(std.getFee().getFeePaid());
		System.out.println(std.getFee().getTotalFee());
		
		System.out.println(std.getEmails());
		System.out.println(std.getPhones());
	}
}	
