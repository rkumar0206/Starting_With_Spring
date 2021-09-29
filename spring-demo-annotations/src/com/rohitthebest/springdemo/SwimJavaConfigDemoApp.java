package com.rohitthebest.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read java config file
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// get the bean from spring container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class); // when using defined bean-id
	
		System.out.println(swimCoach.getDailyWorkOut());
		System.out.println(swimCoach.getDailyFortune());
		
		// new swim coach method which are injected
		// by the properties file
		System.out.println("email : " + swimCoach.getEmail());
		System.out.println("team : " + swimCoach.getTeam());
		
		
		// close the context
		
		context.close();
	}

}
