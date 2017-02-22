package com.practice.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Shape shape = context.getBean("shape", Shape.class);
		System.out.println(shape.getCircle().getMsg());
	}
}
