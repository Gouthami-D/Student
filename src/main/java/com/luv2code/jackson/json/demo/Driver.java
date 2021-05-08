package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			ObjectMapper mapper =new ObjectMapper();
			
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println("First Name is "+theStudent.getFirstName());
			System.out.println("Last Name is "+theStudent.getLastName());
			
			
			Address tempAddress =theStudent.getAddress();
			System.out.println("street " +tempAddress.getStreet());
			System.out.println("City is "+tempAddress.getCity());
			
			for(String templanguages  :  theStudent.getLanguages()) {
				System.out.println(templanguages);
			}
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
