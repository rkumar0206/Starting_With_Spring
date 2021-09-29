package com.rohitthebest.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods of the bean

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// call the methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// close the context
		context.close();
	}

}
