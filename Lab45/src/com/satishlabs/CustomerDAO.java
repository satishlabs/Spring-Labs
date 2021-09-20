package com.satishlabs;

import java.util.List;

public interface CustomerDAO {
	public void addCustomer(CustomerTO cto);
	public List<CustomerTO> getAllCustomers();
}
