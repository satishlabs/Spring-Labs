package com.satishlabs;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satishlabs.configure.MyConfiguration;

public class Lab25 {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		ctx.start();
		MyConfiguration config = (MyConfiguration) ctx.getBean("my");
		Batch b = new Batch("B-25", "2-July-2021", "8:30-7:30", 150);
		config.addBatch(b);
		
		Workshop ws = new Workshop("Web Services", 5000, 99);
		config.addWorkshop(ws);
		
		ctx.stop();
		ctx.close();
	}
}
