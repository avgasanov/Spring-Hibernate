package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccount = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		theAccount.addAccount();
		
		// do it again
		System.out.println("\n let's call it again \n");
		
		// call the business method again
		theAccount.addAccount();
		
		// close the context
		context.close();
	}

}
