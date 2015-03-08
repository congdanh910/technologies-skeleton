package com.technologies.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSheduled {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/technologies-skeleton-servlet.xml");
	}
}
