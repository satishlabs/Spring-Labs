package com.satishlabs.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO{
	@Autowired
	private HibernateTemplate hibernateTemp;
	
	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> ctoList = new ArrayList<CustomerTO>();
		String hql = "from customer c";
		List<Customer> list = hibernateTemp.find(hql);
		for(Customer c: list) {
			CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String hql = "from customer c where c.email=?";
		List<Customer> list = hibernateTemp.find(hql,email);
		Customer c = list.get(0);
		CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		
		return cto;
	}

	@Override
	public List<CustomerTO> getCustomersByCity(String city) {
		List<CustomerTO> ctoList = new ArrayList<CustomerTO>();
		String hql = "from customer c where c.city=?";
		List<Customer> list = hibernateTemp.find(hql, city);
		for(Customer c:list) {
			CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public int getCustomersCount() {
		String hql ="from customer c";
		List<Customer> list = hibernateTemp.find(hql);
		return list.size();
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		String hql = "from customer c where c.email=?";
		List<Customer> list = hibernateTemp.find(hql, email);
		Customer c = list.get(0);
		return c.getCity();
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		String hql = "from customer c where c.email=?";
		List<Customer> list = hibernateTemp.find(hql);
		Customer c = list.get(0);
		return c.getPhone();
	}
	
	
}
