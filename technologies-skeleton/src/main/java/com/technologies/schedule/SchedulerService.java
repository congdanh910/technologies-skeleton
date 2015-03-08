package com.technologies.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

	@Scheduled(cron = "*/5 * * * * ?")
	private void runSchedule(){
		System.out.println("run scheduled.........................");
	}
}
