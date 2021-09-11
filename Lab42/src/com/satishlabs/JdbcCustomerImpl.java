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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCustomersCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
