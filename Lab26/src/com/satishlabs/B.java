package com.satishlabs;

public class B {
	private int b; //C.I.
	private String str; //C.I
	
	public void setB(int b) {
		this.b = b;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return ""+b+"\t"+str;
	}
}
