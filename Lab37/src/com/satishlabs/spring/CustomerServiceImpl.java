package com.satishlabs.spring;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void addCustomer() {
		System.out.println("addCustomer - begin");
		System.out.println("addCustomer - done");
		System.out.println("addCustomer - end");
	}

	@Override
	public void updateCustomer() {
		System.out.println("updateCustomer - begin");
		System.out.println("updateCustomer - done");
		System.out.println("updateCustomer - end");
	}

}
