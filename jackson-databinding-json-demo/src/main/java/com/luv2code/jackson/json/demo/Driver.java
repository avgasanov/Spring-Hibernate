package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			Student student = 
					mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println("First Name: " + student.getFirstName());
			System.out.println("Last Name: " + student.getLastName());
			
			Address tempAddress = student.getAddress();
			
			System.out.println("Street: " + tempAddress.getStreet());
			System.out.println("Street: " + tempAddress.getCity());
			
			for (String tempLang : student.getLanguages()) {
				System.out.println(tempLang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
