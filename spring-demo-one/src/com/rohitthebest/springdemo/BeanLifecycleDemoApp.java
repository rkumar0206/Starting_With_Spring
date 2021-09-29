package com.rohitthebest.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-lifecycle-applicationContext.xml");

		// retrieve bean from spring container

		/**
		 * Using init-method and destroy-method in xml file will run our
		 * custom methods on startup and end of the bean lifecycle
		 * 
		 * Note : when using scope = "prototype" : the Spring does not call the 
		 * destroy method as Spring does not manage the complete lifecycle of a 
		 * prototype bean
		 */
		
		Coach coach1 = context.getBean("myCoach", Coach.class);

		System.out.println(coach1.getDailyWorkout());
		
		context.close();
	}

}
