package com.satishlabs;

public class B {
	private int b;
	private String str;
	
	public B(int b, String str) {
		System.out.println("B - 2 arg");
		this.b = b;
		this.str = str;
	}
	
	public void showB() {
		System.out.println("B - showB()");
		System.out.println(b);
		System.out.println(str);
	}
	
}
