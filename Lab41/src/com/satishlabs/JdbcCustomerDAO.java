package com.satishlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addCustomer(CustomerTO cto) {
		String sql = "insert into customers values(?,?,?,?,?)";
		Object arsg[] = {cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		jdbcTemplate.update(sql, arsg);
		
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
	}

}
