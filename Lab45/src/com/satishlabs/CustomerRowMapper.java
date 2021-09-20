package com.satishlabs;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public abstract class CustomerRowMapper implements RowCallbackHandler {

	public CustomerTO mapRow(ResultSet rs, int rn) throws SQLException {
		CustomerTO cto = new CustomerTO();
		cto.setCid(rs.getInt(1));
		cto.setCname(rs.getString(2));
		cto.setEmail(rs.getString(3));
		cto.setPhone(rs.getLong(4));
		cto.setCity(rs.getString(5));
		return cto;
	}


}
