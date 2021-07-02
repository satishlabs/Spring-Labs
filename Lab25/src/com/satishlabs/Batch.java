package com.satishlabs;

public class Batch {
	String bid;
	String sd;
	String timings;
	int nos;
	public Batch(String bid, String sd, String timings, int nos) {
		super();
		this.bid = bid;
		this.sd = sd;
		this.timings = timings;
		this.nos = nos;
	}
	@Override
	public String toString() {
		String msg="Satish Labs .... new Batch";
		msg = msg+"\n Batch Id: "+bid;
		msg = msg+"\n Start Date: "+sd;
		msg = msg+"\n Timings: "+timings;
		msg = msg+"\n No of Seats: "+nos;
		return msg;
	}

}
