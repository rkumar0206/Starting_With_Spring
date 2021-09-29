package com.rohitthebest.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
