package com.technologies.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technologies.model.MongoTest;
import com.technologies.repository.MongoTestRepository;

public class TestMongodb {
	
	private static Logger logger = LoggerFactory.getLogger(TestMongodb.class);
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/technologies-skeleton-servlet.xml");

		MongoTestRepository testRepository = appContext.getBean(MongoTestRepository.class);

//		System.out.println(testRepository.save(new MongoTest("Danh", 28, new Date())));
//		System.out.println(ToStringBuilder.reflectionToString(testRepository.findByName("Danh")));
		MongoTest mongoTest = testRepository.findByName("Danh");
		if (null != mongoTest) {
			System.out.println(String.format("FindByName : %s, %s, %s ", mongoTest.getName(), mongoTest.getAge(), mongoTest.getCreateDate()));
			logger.debug("FindByName : {}, {}, {} ", mongoTest.getName(), mongoTest.getAge(), mongoTest.getCreateDate());
		}
	}
}
