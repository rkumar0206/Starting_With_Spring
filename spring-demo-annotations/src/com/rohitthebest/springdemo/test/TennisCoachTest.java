package com.rohitthebest.springdemo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohitthebest.springdemo.Coach;

class TennisCoachTest {

	ClassPathXmlApplicationContext context = null;
	Coach coach = null;

	public TennisCoachTest() {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		coach = context.getBean("thatSillyCoach", Coach.class);
	}

	@Test
	void testGetDailyWorkOut() {

		String string = coach.getDailyWorkOut();

		System.out.println(string);
		assertNotEquals(string, null);
		assertNotEquals(string, "");
	}

	@Test
	void testGetDailyFortune() {

		String string = coach.getDailyFortune();

		assertNotEquals(string, null);
		assertNotEquals(string, "");
	}

}
