package com.satishlabs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO{

	@Autowired
	private SimpleJdbcTemplate simpleJdbcTemp;
	
	@Override
	public List<CustomerTO> getAllCustomers() {
		String sql ="select * from customers";
		List<CustomerTO> list = simpleJdbcTemp.query(sql,new CustomerRowMapper());
		return list;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String sql = "select * from customers where cid=?";
		CustomerTO cto = (CustomerTO)simpleJdbcTemp.queryForObject(sql, new CustomerRowMapper(), cid);
		return cto;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String sql = "select * from customers where email=?";
		CustomerTO cto = (CustomerTO)simpleJdbcTemp.queryForObject(sql, new CustomerRowMapper(), email);
		return cto;
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		String sql = "select * from customers where city=?";
		CustomerTO cto = simpleJdbcTemp.queryForObject(sql, new CustomerRowMapper(), city);
		return null;
	}

	@Override
	public int getCustomersCount() {
		String sql="select count(*) from customers";
		return simpleJdbcTemp.queryForInt(sql);
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		String sql ="select city from customers where email=?";
		String city=(String)simpleJdbcTemp.queryForObject(sql, String.class, email);
		return city;
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		String sql ="select phone from customers where email=?";
		Long ph=(Long)simpleJdbcTemp.queryForObject(sql, Long.class, email);
		return ph;
	}

}
