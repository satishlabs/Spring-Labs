package com.satishlabs;

import javax.annotation.Resource;

public class Hello {
	@Resource
	private A aobj;
	
	@Resource(name = "bo")
	private B bobj;
	

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
	
}
