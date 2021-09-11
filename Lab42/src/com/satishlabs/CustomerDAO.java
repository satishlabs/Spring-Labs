package com.satishlabs;

import java.util.List;

public interface CustomerDAO {
	public List<CustomerTO> getAllCustomers();
	
	public CustomerTO getCustomerByCid(int cid);
}
