package com.rohitthebest.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	private ArrayList<String> fortunes = new ArrayList<String>();

	// @PostConstruct will ensure that this function is run in the starting of any method
	// inside this class
	
	@PostConstruct
	private void getFortunesFromFile() {

		System.out.println("DatabaseFortuneService : Inside of getFortunesFromFile()");
		
		try(BufferedReader reader = 
				new BufferedReader(new FileReader("C:\\Users\\Rohit\\eclipse-spring-hibernate\\spring-demo-annotations\\src\\fortunes.txt"))){
			
			String line;
			while((line = reader.readLine()) != null) {
				
				fortunes.add(line);
			}
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	@Override
	public String getFortune() {
		
		int index = new Random().nextInt(fortunes.size());
		
		return fortunes.get(index);
	}

}
