package com.practice.eventHandling;

import org.springframework.context.ApplicationListener;

public class CustomMsgListener implements ApplicationListener<CustomMsgEvent>{

	@Override
	public void onApplicationEvent(CustomMsgEvent customMsgEvent) {
		System.out.println(customMsgEvent.getMessage());
	}	
}
