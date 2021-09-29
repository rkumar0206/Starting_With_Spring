package com.rohitthebest.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It : " + fortuneService.getFortune();
	}
	
	
	
	/**
	 * These are custom code which will during the bean lifecycle i.e. in starting 
	 * and in the end
	 */
	
	// add an init method

	public void doMyStartupStuff() {
		
		System.out.println("TrackCoach : inside method doMyStartupStuff");
		
	}
	
	// add destroy method
	
	public void doMyClenUpStuff() {
		
		System.out.println("TrackCoach : inside method doMyClenUpStuff");
		
	}
	
}
