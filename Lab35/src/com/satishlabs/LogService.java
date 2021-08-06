package com.satishlabs;

public class LogService {
	public void logBefore() {
		System.out.println("** LS - logBefore");
	}
	public void logReturning() {
		System.out.println("** LS - logReturning");
	}
	
	public void logThrowing(Exception ex) {
		System.out.println("**LS logThrowing");
		System.out.println(ex);
	}
}
