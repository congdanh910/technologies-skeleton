package com.technologies.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technologies.model.Test;

public class TestHibernate {
	public static void main(String[] args) {
		ApplicationContext appContext =  new ClassPathXmlApplicationContext("spring/technologies-skeleton-servlet.xml");
		
		Test test = (Test) appContext.getBean("test");
		System.out.println(test.getName());
	}
}
