package com.satishlabs;

public class Address {
	private String city;
	private String street;
	private String state;
	public Address(String city, String street, String state) {
		System.out.println("Address-2 args");
		this.city = city;
		this.street = street;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", state=" + state + "]";
	}
	
	
}
