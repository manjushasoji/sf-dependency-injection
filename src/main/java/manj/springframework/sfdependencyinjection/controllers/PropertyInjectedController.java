package manj.springframework.sfdependencyinjection.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import manj.springframework.sfdependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectedGreetingServiceImpl")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
