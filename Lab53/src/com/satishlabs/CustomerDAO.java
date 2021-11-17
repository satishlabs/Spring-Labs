package com.satishlabs;

import java.util.List;

public interface CustomerDAO {
	public List<CustomerTO> getAllCustomers();
	public CustomerTO getCustomerByEmail(String email);
	public List<CustomerTO> getCustomerByCity(String city);
	public int getCustomerCount();
	public String getCustomerCityByEmail(String email);
	public Long getCustomerPhoneByEmail(String email);
}
