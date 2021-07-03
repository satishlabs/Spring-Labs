package com.satishlabs;

public class A {
	private int a; //S.I.
	private String msg; //S.I
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return ""+a+"\t"+msg;
	}
}
