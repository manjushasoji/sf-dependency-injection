package manj.springframework.sfdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

import manj.springframework.sfdependencyinjection.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
