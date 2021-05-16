package com.satishlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Autowired
	@Qualifier("ao1")
	private A aobj;
	
	@Autowired
	@Qualifier("bo1")
	private B bobj;
	

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
	
}
