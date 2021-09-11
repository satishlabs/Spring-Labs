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

}
