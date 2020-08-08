package manj.springframework.sfdependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manj.springframework.sfdependencyinjection.services.PropertyInjectedGreetingServiceImpl;

public class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new PropertyInjectedGreetingServiceImpl()); 
	}
	
	@Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());

    }
}
