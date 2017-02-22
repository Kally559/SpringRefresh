package com.practice.eventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Person implements ApplicationEventPublisherAware{

	private int id;
	private String name;
	private ApplicationEventPublisher publisher;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	
	public void publish() {
		CustomMsgEvent ce = new CustomMsgEvent(this,"Hello");
	    publisher.publishEvent(ce);
	}
}
