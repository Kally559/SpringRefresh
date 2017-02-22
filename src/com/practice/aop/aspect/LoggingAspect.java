package com.practice.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@AfterReturning(pointcut = "execution(public * getMsg())",
			returning="result" )
	public void loggingAdvice(JoinPoint jp, Object result){
		System.out.println("Advice Run. Get Method is called");
		System.out.println("Signature "+jp.getSignature().getName());
		System.out.println("Paramaters "+jp.getArgs().length);
		System.out.println("Result "+result.toString());
	}

}
