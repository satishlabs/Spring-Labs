package com.satishlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab56 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("satishlabs.xml");
		AccountDAO adao = (AccountDAO) ctx.getBean("adao");

		System.out.println(adao.getBalance(101));
		System.out.println(adao.getBalance(102));

		//1. deposit
		adao.deposit(101, 20000.0);

		//2. withdraw
		adao.withdraw(102, 50000.0);

		//3. get Balance
		System.out.println(adao.getBalance(101));
		System.out.println(adao.getBalance(102));

		//4. Funds Transfer
		System.out.println(adao.getBalance(103));
		System.out.println(adao.getBalance(101));

		adao.fundsTransfer(103, 101, 30000.0);

		System.out.println(adao.getBalance(103));
		System.out.println(adao.getBalance(101));
	}
}
