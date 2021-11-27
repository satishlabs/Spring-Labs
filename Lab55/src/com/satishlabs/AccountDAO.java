package com.satishlabs;

public interface AccountDAO {
	public void deposit(int accno,double amt);
	public void withdraw(int accno,double amt);
	public void fundsTransfer(int accno,int daccno,double amt);
}
