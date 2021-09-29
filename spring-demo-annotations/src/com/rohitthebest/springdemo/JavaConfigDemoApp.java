package com.rohitthebest.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author Rohit
 *
 *	In this class we are going to use the Java configuration file. We don't need 
 *	xml file, we can do all that stuffs using the java config file, here SportsConfig.java
 */

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read java config file
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class); // when using defined bean-id
		//Coach coach = context.getBean("tennisCoach", Coach.class); // using default bean-id
		
		
		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		
		// call a method on the bean
		
		System.out.println(tennisCoach.getDailyWorkOut());
		System.out.println(tennisCoach.getDailyFortune()+ "\n");
		
		System.out.println(footballCoach.getDailyWorkOut());
		System.out.println(footballCoach.getDailyFortune());
		
		
		// close the context
		
		context.close();
	}

}
