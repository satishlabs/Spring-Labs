package com.satishlabs;

public class Hello {
	private A aobj;
	private B bobj;

	public Hello() {
		System.out.println("Hello -- ()");
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
