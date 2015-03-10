package com.technologies.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

	@Scheduled(cron = "${cron.expression.test}")
	private void runSchedule(){
//		System.out.println("run scheduled.........................");
	}
}
