package com.satishlabs.listener;

import org.springframework.context.ApplicationListener;

import com.satishlabs.BatchEvent;

public class MyListener3 implements ApplicationListener<BatchEvent> {

	@Override
	public void onApplicationEvent(BatchEvent event) {
		System.out.println("***** MyListener2 ******  onApplicationEvent() ####");
		System.out.println("WorkshopEvent is raised");
		BatchEvent we = event;
		System.out.println(we.getBatch());
	}

}
