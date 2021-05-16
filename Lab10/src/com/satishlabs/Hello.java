package com.satishlabs;

public class Hello {
	private A aobj;
	private B bobj;
	
	public Hello() {
		System.out.println("Hello - ()");
	}
	
	public Hello(B bobj) {
		System.out.println("Hello - (B) ");
		this.bobj = bobj;
	}
	
	public Hello(A aobj) {
		System.out.println("Hello - (A) ");
		this.aobj = aobj;
	}
	
	
	
	public Hello(A aobj, B bobj) {
		System.out.println("Hello - (A,B)");
		this.aobj = aobj;
		this.bobj = bobj;
	}

	
	
	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
	
}
