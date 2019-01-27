package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo") //manually defined no need to scan
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() { // the method name is bean id
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
