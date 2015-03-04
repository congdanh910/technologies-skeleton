package com.technologies.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technologies.model.Test;
import com.technologies.services.TestService;

public class TestHibernate {
	public static void main(String[] args) {
		ApplicationContext appContext =  new ClassPathXmlApplicationContext("spring/technologies-skeleton-servlet.xml");
		
		TestService testService = (TestService) appContext.getBean("testService");
		testService.makePersistent(new Test("Danh", 28, new Date(), 20));
	}
}
