package manj.springframework.sfdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

import manj.springframework.sfdependencyinjection.services.GreetingService2;

@Controller
public class GreetingController {

	private final GreetingService2 greetingService2;

	public GreetingController(GreetingService2 greetingService2) {
		this.greetingService2 = greetingService2;
	}

	public String sayGreeting() {

		return greetingService2.sayGreeting2();
	}

}
