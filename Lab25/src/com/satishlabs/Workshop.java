package com.satishlabs;

public class Workshop {
	String topic;
	double fee;
	int nos;
	public Workshop(String topic, double fee, int nos) {
		super();
		this.topic = topic;
		this.fee= fee;
		this.nos = nos;
	}
	@Override
	public String toString() {
		String msg = "Satish Labs ...";
		msg = msg+"\n Topic: "+topic;
		msg = msg+"\n Fee: "+fee;
		msg = msg+"\n No of Seats: "+nos;
		return msg;
	}
	
	
}
