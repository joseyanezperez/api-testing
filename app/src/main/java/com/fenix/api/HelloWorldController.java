package com.fenix.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		HelloWorldService helloWorldService = new HelloWorldService();
		helloWorldService.hellWorldService("1");
		return ;

	}

	@GetMapping("/helloPojo")
	public HelloPojo sayHelloPojo() {
		System.out.println("Inside /helloPojo");
		HelloPojo helloPojo = new HelloPojo();
		helloPojo.setValue1("Hello");
		helloPojo.setValue2("World!");
		return helloPojo;
	}
}
