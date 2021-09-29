package com.rohitthebest.springdemo;

import java.util.Random;

public class RandomHappyFortunes implements FortuneService {

	public String getFortune() {
		
		String[] randomFortune = new String[3];
		
		randomFortune[0] = "You are going to receive an unexpected surprise today";
		randomFortune[1] = "Today you will hear some great news";
		randomFortune[2] = "You are lucky today";
		
		int random = new Random().nextInt(3);
		
		return randomFortune[random];
	}
}
