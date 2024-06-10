package com.fenix.api;

public class HelloWorldService {

	public HelloWorldService() {
	}
	
	public String getMessage(String option) {
		String selectedOption = option;
		if(selectedOption.equals("1")) {
			return "Hello world 1";
		}
		else if (selectedOption.equals("2")) {
			return "Hello world 1";
		}
		else return "Wrong input type";
		
	}
}
