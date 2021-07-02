package com.satishlabs.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.satishlabs.Batch;
import com.satishlabs.BatchEvent;
import com.satishlabs.Workshop;
import com.satishlabs.WorkshopEvent;

public class MyListener1 implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("***** MyListener1 ******  onApplicationEvent() ####");
		
		if(event instanceof BatchEvent) {
			BatchEvent batchEvent = (BatchEvent) event;
			Batch batch = batchEvent.getBatch();
			System.out.println(batch);
		}else if(event instanceof WorkshopEvent) {
			WorkshopEvent wsEvent = (WorkshopEvent) event;
			Workshop ws = wsEvent.getWs();
			System.out.println(ws);
		}else {
			System.out.println(event);
		}
		
	}

	

}
