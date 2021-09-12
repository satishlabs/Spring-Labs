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
		String sql ="update customers set name=?";
		Object args[] = {cto.getCname()};
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		String sql ="delete from customers where cid=?";
		jdbcTemplate.update(sql, cid);
	}

}
