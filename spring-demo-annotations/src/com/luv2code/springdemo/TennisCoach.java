package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component // default bean id  tennisCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
