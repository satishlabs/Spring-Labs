package com.satishlabs;

import org.aspectj.lang.ProceedingJoinPoint;

public class TxService {

	public void runTx(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("** TxService...runTx()...begin");
		begin();
		pjp.proceed();
		commit();
		System.out.println("** TxService...runTx()...end");
	}

	public void begin() {
		System.out.println("** TS - begin");
	}

	public void commit() {
		System.out.println("** TS - commit");
	}

	public void rollback() {
		System.out.println("** TS - rollback");
	}
}
