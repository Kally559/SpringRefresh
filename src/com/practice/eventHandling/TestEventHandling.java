package com.practice.eventHandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.HelloWorld.HelloWorld;

public class TestEventHandling {

	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("This is the begining of  event");
		Person obj = (Person)context.getBean("person");
		obj.publish();
		System.out.println("This is the end of  event");
				
		/*System.out.println("This is the Start of custom event");
		CustomMsgEvent customMsgEvent = new CustomMsgEvent(context, 
                "Test message");
		context.publishEvent(customMsgEvent);
		System.out.println("This is the end of custom event");*/
		
	}
}
