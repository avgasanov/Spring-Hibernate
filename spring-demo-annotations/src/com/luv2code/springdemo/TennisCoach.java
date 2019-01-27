package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // default bean id  tennisCoach
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define a setter method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
//		this.fortuneService = theFortuneService;
//	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
