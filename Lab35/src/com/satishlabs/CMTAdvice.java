package com.satishlabs;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class CMTAdvice implements ThrowsAdvice{

	@Autowired
	LogService ls = null;
	
	@Autowired
	TxService ts = null;
	
	public void afterThrowin(Exception ex) {
		ts.rollback();
		ls.logThrowing(ex);
	}
}
