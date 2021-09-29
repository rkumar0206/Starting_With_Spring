package com.rohitthebest.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"bean-scope-applicationContext.xml");

		// retrieve bean from spring container

		/**
		 * By default the bean object has the singleton scope - (all the objects share
		 * the same instance of the object)
		 * 
		 * prototype scope : in this the all the bean classes will have the there new
		 * instance
		 * 
		 */

		Coach coach1 = context.getBean("myCoach", Coach.class);

		Coach coach2 = context.getBean("myCoach", Coach.class);

		// check if they are the same bean
		boolean result = (coach1 == coach2);

		// print the results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for coach1: " + coach1);

		System.out.println("\nMemory location for coach2: " + coach2);

		context.close();
	}

}
