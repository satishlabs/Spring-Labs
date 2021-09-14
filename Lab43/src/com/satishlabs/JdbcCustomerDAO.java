package com.satishlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO{
	@Autowired
	private SimpleJdbcTemplate simpleJdbcTemp;
	
	@Override
	public void addCustomer(CustomerTO cto) {
		String sql = "insert into customers values(?,?,?,?,?)";
		Object arsg[] = {cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity()};
		simpleJdbcTemp.update(sql, arsg);
		
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		String sql ="update customers set name=?";
		Object args[] = {cto.getCname()};
		simpleJdbcTemp.update(sql, args);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		String sql ="delete from customers where cid=?";
		simpleJdbcTemp.update(sql, cid);
	}

}
