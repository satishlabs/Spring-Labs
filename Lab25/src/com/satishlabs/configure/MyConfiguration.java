package com.satishlabs.configure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.satishlabs.Batch;
import com.satishlabs.BatchEvent;
import com.satishlabs.Workshop;
import com.satishlabs.WorkshopEvent;

public class MyConfiguration implements ApplicationContextAware{

	ApplicationContext ctx = null;
	
	public void addBatch(Batch batch) {
		ctx.publishEvent(new BatchEvent(this, batch));
	}
	
	public void addWorkshop(Workshop ws) {
		ctx.publishEvent(new WorkshopEvent(this, ws));
	}
	
	public void setApplicationContext(ApplicationContext ctx){
		this.ctx = ctx;
	}

}
