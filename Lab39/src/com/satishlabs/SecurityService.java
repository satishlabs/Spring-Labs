package com.satishlabs;

import org.aspectj.lang.ProceedingJoinPoint;

public class SecurityService {
	
	public void verifyUser(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("** SS - verifyUser -- begin");
		pjp.proceed();
		System.out.println("** SS - verifyUser -- end");
	}
}
