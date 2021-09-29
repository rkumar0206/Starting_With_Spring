package com.rohitthebest.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @author Rohit
 *	All the stuffs we were doing using the xml configuration file can also be 
 *done using the java configuration file with no xml
 */

@Configuration
//@ComponentScan("com.rohitthebest.springdemo")
@PropertySource("classpath:sport.properties")
public class SportsConfig {

	
	// define bean for our sad fortune service
	
	// the bean id will be the method name
	@Bean
	public FortuneService sadFortuneService() {
		
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
	}
	
	// define bean for our swim coach and inject dependency
}
