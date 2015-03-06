package com.technologies.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.technologies.model.MongoTest;

@Aspect
@Configuration
@EnableAspectJAutoProxy
public class TestAOP {

	@Around("execution(* com.technologies.repository.MongoTestRepository.findByName(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("logAround() is running!");
		System.out.println(String.format("hijacked : %s", joinPoint.getSignature().getName()));
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("============================================= \n");
		Object resutl = joinPoint.proceed();
		return resutl;
	}
	
	@Before(value = "execution(* com.technologies.repository.MongoTestRepository.findByName(..)) && " + "args(name)")
	public void logBefore(JoinPoint joinPoint, String name) {
		System.out.println("logBefore() is running!");
		System.out.println(String.format("hijacked : %s", joinPoint.getSignature().getName()));
		System.out.println("Name  : " + name);
		System.out.println("============================================= \n");
	}
	
	@After("execution(* com.technologies.repository.MongoTestRepository.findByName(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter() is running!");
		System.out.println(String.format("hijacked : %s", joinPoint.getSignature().getName()));
		System.out.println("============================================= \n");
	}
	
	@AfterReturning(pointcut = "execution(* com.technologies.repository.MongoTestRepository.findByName(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("logAfterReturning() is running!");
		System.out.println(String.format("hijacked : %s", joinPoint.getSignature().getName()));
		System.out.println("Method returned value is : " + ((result != null)?((MongoTest)result).getName():result));
		System.out.println("============================================= \n");
	}
	
}
