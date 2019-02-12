package com.luv2code.springboot.demo.mycoolappsboot.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teamInfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time in server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5 k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "It is your lucky day";
	}
}
