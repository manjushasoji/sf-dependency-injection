package manj.springframework.sfdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manj.springframework.sfdependencyinjection.services.PropertyInjectedGreetingServiceImpl;

public class PropertyInjectedControllerTest {
	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	void setUp() {
		propertyInjectedController =  new PropertyInjectedController();
		propertyInjectedController.greetingService = new PropertyInjectedGreetingServiceImpl();
	}
	
	@Test
	void getGreeting() {
		System.out.println(propertyInjectedController.getGreeting());
	}
}
