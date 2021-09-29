package com.rohitthebest.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] data = {
			
			"Beware of the wolf in sheep's clothing",
			"Deligence is the mother of good luck",
			"The Journey is the reward"
	};
	
	@Override
	public String getFortune() {

		// pick a random string from the array
		
		int index = new Random().nextInt(data.length);
		
		return data[index];
	}

}
