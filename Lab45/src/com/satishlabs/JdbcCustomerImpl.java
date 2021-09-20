package com.satishlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerImpl extends JdbcDaoSupport implements CustomerDAO{

	@Override
	public void addCustomer(CustomerTO cto) {
		PreparedStatementCreator psc = new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement("insert into customers values(?,?,?,?,?)");
				ps.setInt(1, cto.getCid());
				ps.setString(2, cto.getCname());
				ps.setString(3, cto.getEmail());
				ps.setString(4, cto.getCity());
				ps.setLong(5, cto.getPhone());
				return ps;
			}
		};
		getJdbcTemplate().update(psc);
	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		
		return null;
	}
	
}
