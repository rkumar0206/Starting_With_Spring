package com.rohitthebest.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	// create a no-arg constructor
	public CricketCoach() {

		System.out.println("CricketCoach : Inside no-arg constructor");
	}
	
	public String getTeam() {
		return team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : Inside setter method - setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside setter method - setTeam()");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}


	// will call the setter method using setter dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	
	
	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
