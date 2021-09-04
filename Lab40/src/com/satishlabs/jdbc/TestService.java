package com.satishlabs.jdbc;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class TestService {
	@Resource(name = "oracleDS")
	private DataSource oracleDS;
	
	@Resource(name = "mysqlDS")
	private DataSource mysqlDS;
}
