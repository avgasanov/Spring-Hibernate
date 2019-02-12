package com.luv2code.springboot.demo.mycoolappsboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
