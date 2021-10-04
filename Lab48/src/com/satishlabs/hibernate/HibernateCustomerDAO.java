package com.satishlabs.hibernate;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO{
	@Autowired
	private HibernateTemplate hibernateTemp;
	@Override
	public void addCustomer(CustomerTO cto) {
		CustomerTO cust = new CustomerTO(cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		hibernateTemp.save(cust);
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		Customer c = hibernateTemp.load(Customer.class, cto.getCid());
		c.setCid(cto.getCid());
		c.setCname(cto.getCname());
		c.setEmail(cto.getEmail());
		c.setPhone(cto.getPhone());
		c.setCity(cto.getCity());
		
		hibernateTemp.update(c, LockMode.NONE);
	}

	@Override
	public void deleteCustomer(int cid) {
		Customer c = hibernateTemp.load(Customer.class, cid);
		hibernateTemp.delete(c, LockModeNoNE);
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer c = hibernateTemp.load(Customer.class, cid);
		CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}
	
}
