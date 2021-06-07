package com.satishlabs;

import javax.annotation.Resource;

public class TestBean {
	@Resource(name = "oracleDS")
	DataSource oracleDataSource;
	
	@Resource(name = "mysqlDS")
	DataSource mysqlDataSource;
	
	public void show() {
		System.out.println(oracleDataSource);
		System.out.println(mysqlDataSource);
	}
}
