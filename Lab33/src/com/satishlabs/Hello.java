package com.satishlabs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean{
	static {
		System.out.println("Hello - S.B");
	}
	Hello(){
		System.out.println("Hello -D.C.");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Hello init()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello - afterPropertiesSet()");
	}
	
	public void myInit() {
		System.out.println("Hello - myinit()");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Hello - cleanup()");
	}
	
	public void destroy() {
		System.out.println("Hello - destroy()");
	}
	
	public void mycleanup() {
		System.out.println("Hello - mycleanup()");
	}
	public void show() {
		System.out.println("Hello - show()");
	}

}
