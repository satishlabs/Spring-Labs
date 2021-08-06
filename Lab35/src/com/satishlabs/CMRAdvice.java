package com.satishlabs;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class CMRAdvice implements AfterReturningAdvice{
	@Autowired
	LogService ls = null;
	
	@Autowired
	TxService ts = null;
	
	@Override
	public void afterReturning(Object rv, Method method, Object[] args, Object target) throws Throwable {
		ts.commit();
		ls.logReturning();	
	}

}
