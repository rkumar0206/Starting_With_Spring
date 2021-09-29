package com.rohitthebest.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Rohit
 *
 * adding this annotation, Spring will scan this class and automatically register this 
 * bean and will use the bean id 'thatSillyCoach' 
 * 
 * if we do not define the bean id then it will automatically take the 
 * class name and make the first alphabet as lowercase
 * example : if we annotate as @Component then it will
 * make the default bean id as : tennisCoach
 *
 *@Scope is used for defining the scope of the object, by default it is a Singleton scope
 */

@Component("thatSillyCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

	// We can also do dependency injection using field injection just by
	// annotating the field with @Autowired
	
	// using @Qualifier annotation we specify that we want to inject the 
	// value which is coming from the happyFortuneService as there may be many
	// implementation of FortuneService
	
//	@Autowired
//	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
//	
//	public TennisCoach() {
//
//		System.out.println("TennisCoach -> Inside the default constructor");
//	}
	
	// dependency injection using constructor and Autowired annotation
	@Autowired
	public TennisCoach(@Qualifier("databaseFortuneService") FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}
	
	// we can also make any 'method' to be injected by dependency injection
	// just by annotating it with Autowired
/*	@Autowired
	public void someMethod(FortuneService fortuneService) {

		System.out.println("TennisCoach -> Inside the someMethod()");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkOut() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	// define my init method
	
	/**
	 * @PostConstruct annotation is used for defining our starting method, which
	 * run by the Spring at first
	 * 
	 * Note : @PostConstruct and @PreDestroy annotations works 
	 * only till the java version 8, but for the 
	 * above version it will show an error, so we need to download the 
	 * javax.annotation-api 1.3.2 (https://jar-download.com/artifacts/javax.annotation/javax.annotation-api/1.3.2/source-code)
	 * and add it our build path
	 */
	@PostConstruct
	public void doMyStartUpStuff() {
		
		System.out.println("TennisCoach : -> Inside of doMyStartUpStuff()");
	}
	
	// define my destroy method

	/**
	 * @PreDestroy method is run by the Spring in the end and before the context is closed...
	 * 
	 * Note : PreDestroy method is not called when we use 'prototype scope'
	 */
	
	@PreDestroy
	public void doMyCleaupStuff() {
		
		System.out.println("TennisCoach : -> Inside of doMyCleaupStuff()");
	}
	
	
	

}
