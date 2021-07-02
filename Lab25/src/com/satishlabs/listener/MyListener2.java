package com.satishlabs.listener;

import org.springframework.context.ApplicationListener;

import com.satishlabs.WorkshopEvent;

public class MyListener2 implements ApplicationListener<WorkshopEvent> {

	@Override
	public void onApplicationEvent(WorkshopEvent event) {
		System.out.println("***** MyListener2 ******  onApplicationEvent() ####");
		System.out.println("WorkshopEvent is raised");
		WorkshopEvent we = event;
		System.out.println(we.getWs());
	}

}
