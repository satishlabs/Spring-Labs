package com.satishlabs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;

public class JpaCustomerDAO implements CustomerDAO{
	
	@Autowired
	private JpaTemplate jpaTemp = null;
	
	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> ctoList = new ArrayList<CustomerTO>();
		String jpaql = "from Customer c";
		List<Customer> list = jpaTemp.find(jpaql);
		for(Customer c:list) {
			CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String jpaql = "from Customer c where c.email=?";
		List<Customer> list = jpaTemp.find(jpaql, email);
		Customer c = list.get(0);
		CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		List<CustomerTO> ctoList = new ArrayList<CustomerTO>();
		String jpaql = "select Customer c where c.city=?";
		List<Customer> list = jpaTemp.find(jpaql, city);
		for(Customer c:list) {
			CustomerTO cto = new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public int getCustomerCount() {
		String jpaql = "from Customer c";
		List<Customer> list = jpaTemp.find(jpaql);
		return list.size();
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		String jpaql = "from Customer c";
		List<Customer> list = jpaTemp.find(jpaql, email);
		Customer c = list.get(0);
		return c.getCity();
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		String jpaql = "from Customer c";
		List<Customer> list = jpaTemp.find(jpaql, email);
		Customer c = list.get(0);
		return c.getPhone();
	}

}
