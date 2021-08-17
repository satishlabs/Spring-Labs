package com.satishlabs;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogService {
	public void log(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("** LogService.. log()...begin");
		logBefore();
		pjp.proceed();
		logReturning();
		System.out.println("** LogService.. log()...end");
	}

	public void logBefore() {
		System.out.println("** LS - logBefore");
	}

	public void logReturning() {
		System.out.println("** LS - logReturning");
	}

	public void logThrowing(Exception ex) {
		System.out.println("**LS logThrowing");
		System.out.println(ex);
	}

	public void logOK() {
		System.out.println("** LS...logOK()...");
	}
}
