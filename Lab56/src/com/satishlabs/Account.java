package com.satishlabs;

public class Account {
	private int accno;
	private String acctype;
	private double balance;
	public Account() {}
	
	public Account(String acctype, double balance) {
		super();
		this.acctype = acctype;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", acctype=" + acctype + ", balance=" + balance + "]";
	}
	
	
}
