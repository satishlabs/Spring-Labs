package com.satishlabs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Lab21 {
	public static void main(String[] args) {
		//AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("satish.xml");
		
		Resource res =  new ClassPathResource("satish.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("Spring Container is Ready ...");
		System.out.println("-----------------------------");
		Hello hello = (Hello) factory.getBean("HELLO");
		hello.show();
		
		System.out.println("-----------------------------");
		System.out.println("Spring Container going to Shutdown...");
		//ctx.registerShutdownHook();
	}
}
