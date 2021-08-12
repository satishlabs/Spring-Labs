package com.satishlabs.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityService {
	@Pointcut(value="execution*com.satishlabs.AccountService.my*(..)")
	public void myc1() {
		
	}
	@Pointcut(value="execution*com.satishlabs.AccountService.up*(..)")
	public void myc2() {
		
	}
	@Before("myc1() or myc2()")
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("** SS - verifyUser -- begin");
		pjp.proceed();
		System.out.println("** SS - verifyUser -- End");
	}
}
