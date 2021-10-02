package com.satishlabs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JdbcCustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private NamedParameterJdbcTemplate nameParameterJdbcTemp;
	
	@Override
	public void addCustomer(CustomerTO cto) {
		String sql = "insert into customers values(:cid,:cname,:email,:phone,:city)";
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		parameters.put("cid", cto.getCid());
		parameters.put("cname", cto.getCname());
		parameters.put("email", cto.getEmail());
		parameters.put("phone", cto.getPhone());
		parameters.put("city", cto.getCity());
		
		nameParameterJdbcTemp.update(sql, parameters);
		
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
