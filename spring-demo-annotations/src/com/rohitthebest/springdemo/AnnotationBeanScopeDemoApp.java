package com.rohitthebest.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		// load Spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from Spring container
	
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		Coach alphaCoach = context.getBean("thatSillyCoach", Coach.class);
		
		boolean result = (coach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " +result);
		
		System.out.println("\nMemory location for coach : " + coach);
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);
		
		// close the context
		context.close();
	}

}
