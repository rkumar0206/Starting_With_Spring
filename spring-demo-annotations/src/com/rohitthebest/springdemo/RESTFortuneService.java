package com.rohitthebest.springdemo;

import org.springframework.stereotype.Component;


// Usually when we have default component bean-id the Spring converts the first
// character into lower-case character but for the special case like this where
// both the first and the second character is in upper-case the Spring does not 
// convert it's bean id i.e RESTFortuneService bean id will be same RESTFortuneService
@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return null;
	}

}
