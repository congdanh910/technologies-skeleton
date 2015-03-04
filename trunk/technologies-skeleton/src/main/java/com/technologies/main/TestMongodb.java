package com.technologies.main;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technologies.model.MongoTest;
import com.technologies.repository.MongoTestRepository;

public class TestMongodb {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/technologies-skeleton-servlet.xml");

		MongoTestRepository testRepository = appContext.getBean(MongoTestRepository.class);

//		System.out.println(testRepository.save(new MongoTest("Danh", 28, new Date())));
//		System.out.println(ToStringBuilder.reflectionToString(testRepository.findByName("Danh")));
		MongoTest mongoTest = testRepository.findByName("Danh");
		if (null != mongoTest) {
			System.out.println(ToStringBuilder.reflectionToString(testRepository.findByCreateDate(mongoTest.getCreateDate())));
		}
	}
}
