package com.satishlabs;

import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Inject
	private A aobj;
	
	@Inject
	@Qualifier("bo2")
	private B bobj;
	
	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
