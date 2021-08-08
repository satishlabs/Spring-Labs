package com.satishlabs;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TxService {
	@Pointcut(value = "execution(*com.satishlabs.AccountService.my*(..))")
	public void myc1() {
		
	}
	
	@Pointcut(value = "execution(*com.satishlabs.AccountService.up*(..))")
	public void myc2() {
		
	}
	@Before("myc1()")
	public void begin() {
		System.out.println("** TS - begin");
	}
	
	@AfterReturning("myc1()")
	public void commit() {
		System.out.println("** TS - commit");
	}
	
	@AfterThrowing("myc1()")
	public void rollback() {
		System.out.println("** TS - rollback");
	}
}
