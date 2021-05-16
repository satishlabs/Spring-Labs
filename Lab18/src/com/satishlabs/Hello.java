package com.satishlabs;

import org.springframework.beans.factory.annotation.Required;

public class Hello {

	private A aobj;

	private B bobj;
	
	@Required
	public void setAobj(A aobj) {
		System.out.println("Hello - setAobj()");
		this.aobj = aobj;
	}

	public void setBobj(B bobj) {
		System.out.println("Hello - setBobj()");
		this.bobj = bobj;
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
