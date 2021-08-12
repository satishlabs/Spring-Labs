package com.satishlabs.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TxService {
	@Pointcut(value = "execution(*com.satishlabs.AccountService.my*(..))")
	public void myc1() {
		
	}
	
	@Pointcut(value = "execution(*com.satishlabs.AccountService.up*(..))")
	public void myc2() {
		
	}
	@Around("myc1() or myc2()")
	public void runTx(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("TxService..runTx()..begin");
		begin();
		pjp.proceed();
		commit();
		System.out.println("TxService..runTx()..end");

	}
	public void begin() {
		System.out.println("** TS - begin");
	}
	
	public void commit() {
		System.out.println("** TS - commit");
	}
	
	@AfterThrowing("myc1() or myc2()")
	public void rollback() {
		System.out.println("** TS - rollback");
	}
}
