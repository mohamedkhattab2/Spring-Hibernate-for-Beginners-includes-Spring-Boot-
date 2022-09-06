package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Qualifier("happyFortuneService")
	@Autowired
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkOut() {
		return "Practice your bakhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
