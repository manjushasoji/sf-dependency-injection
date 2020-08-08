package manj.springframework.sfdependencyinjection.controllers;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manj.springframework.sfdependencyinjection.services.PropertyInjectedGreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
    void setUp() {
		constructorInjectedController = new ConstructorInjectedController(new PropertyInjectedGreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(constructorInjectedController.getGreeting());

    }
    

}
