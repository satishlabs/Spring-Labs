package com.satishlabs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object obj, String bname) throws BeansException {
		System.out.println("MyBeanPostProcessor - postProcessAfterInitialization - "+bname);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String bname) throws BeansException {
		System.out.println("MyBeanPostProcessor - postProcessBeforeInitialization - "+bname);
		return obj;
	}

}
