package com.practice.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	public static void main(String args[]){
		System.out.println("Hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");		
		HelloWorld object = (HelloWorld)context.getBean("helloWorld");		
		object.getMessage();		
	}

}
