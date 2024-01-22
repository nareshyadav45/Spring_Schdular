package com.schdule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Reportervice {
	
//	@Scheduled(fixedDelay = 5000)
//	public void report() {
//		System.out.println("Report Service.....");
//	}
	
	@Scheduled(cron = "* 1 * * * *")
	public void report() {
		System.out.println("Report Service.....");
	}
	
}
