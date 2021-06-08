package com.satishlabs.spring;

import java.util.List;

public class Student {
	StudentId sid;
	String sname;
	long phone;
	Fee fee;
	List<String> emails;
	List<Long> phones;
	public StudentId getSid() {
		return sid;
	}
	public void setSid(StudentId sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Long> getPhones() {
		return phones;
	}
	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}
	
	
}
