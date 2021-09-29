package com.rohitthebest.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

	// create a fortune service property
	
	private FortuneService fortuneService;
	
	// create a default constructor
	
	public FootballCoach() {

		System.out.println("Football coach -> Inside the default construtor");
	}
	
	// create a setter method for dependency injection
	// annotate the method with the @Autowired
	
	@Autowired // for dependency injection using setter method and annotation
	@Qualifier("databaseFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("Football coach -> Inside the setter method");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {

		return "Do some Leg practice for 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
