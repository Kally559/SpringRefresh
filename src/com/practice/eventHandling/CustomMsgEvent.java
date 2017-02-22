package com.practice.eventHandling;

import org.springframework.context.ApplicationEvent;

public class CustomMsgEvent extends ApplicationEvent{

	private String msg;
	
	public CustomMsgEvent(Object source, String msg) {
		super(source);
        this.msg = msg; 
	}
	
	public String getMessage(){
		return this.msg;
	}

	public String toString(){
		return msg+" This is Custom Event";
	}
}
