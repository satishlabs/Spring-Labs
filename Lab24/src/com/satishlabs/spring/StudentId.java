package com.satishlabs.spring;

public class StudentId {
	String bid;
	int sid;
	public StudentId(int sid, String bid) {
		this.bid = bid;
		this.sid = sid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
