package com.satishlabs;

public class B {
	private int b;
	private String str;

	public void setB(int b) {
		this.b = b;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void show() {
		System.out.println(b);
		System.out.println(str);
	}
	public String toString() {
		return b+"\t"+str;
	}
}
