package com.satishlabs.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO{
	@Autowired
	private  HibernateTemplate hibTemplate;

	@Override
	public void addCustomer(CustomerTO cto) {
		
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}
}
