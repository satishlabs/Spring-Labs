package com.satishlabs;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {
	@Pointcut(value = "execution(*com.satishlabs.AccountService.my*(..))")
	public void myc1() {
		
	}
	@Pointcut(value = "execution(*com.satishlabs.AccountService.up*(..))")
	public void myc2() {
		
	}
	@Before("myc1() or myc2()")
	public void logBefore() {
		System.out.println("** LS - logBefore");
	}
	
	@AfterReturning("myc1()")
	public void logReturning() {
		System.out.println("** LS - logReturning");
	}
	
	@AfterThrowing("myc1()")
	public void logThrowing(Exception ex) {
		System.out.println("**LS logThrowing");
		System.out.println(ex);
	}
	@After("myc1()")
	public void logOK() {
		System.out.println("** LS...logOK()...");
	}
}
