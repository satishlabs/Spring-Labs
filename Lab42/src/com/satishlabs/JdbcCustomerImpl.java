package com.satishlabs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerImpl implements CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<CustomerTO> getAllCustomers() {
		String sql ="select * from customers";
		List list = jdbcTemplate.query(sql, new CustomerRowMapper());
		return list;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String sql = "select * from customers where cid=?";
		Object args[] = {cid};
		CustomerTO cto = jdbcTemplate.queryForObject(sql, args, new CustomerRowMapper());
		return cto;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
	String sql = "select * from customers where email=?";
	Object arsg[]= {email};
	CustomerTO cto = jdbcTemplate.queryForObject(sql, arsg, new CustomerRowMapper());
	return cto;
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		String sql = "select * from customers where city=?";
		Object arsg[]= {city};
		List list= jdbcTemplate.query(sql, arsg, new CustomerRowMapper());
		return list;
	}

	@Override
	public int getCustomersCount() {
		String sql = "select count(*) from customers";
		return jdbcTemplate.queryForInt(sql);
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		String sql = "select city from customers where email=?";
		Object[] args= {email};
		String city = jdbcTemplate.queryForObject(sql, args, String.class);
		return city;
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		String sql = "select phone from customers where email=?";
		Object[] args= {email};
		Long phone = jdbcTemplate.queryForObject(sql, args, Long.class);
		return phone;
	}

}
