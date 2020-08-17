package manj.springframework.sfdependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import manj.springframework.sfdependencyinjection.services.GreetingRepository;
import manj.springframework.sfdependencyinjection.services.GreetingService2;
import manj.springframework.sfdependencyinjection.services.GreetingServiceFactory;

@Configuration 
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}
	
	@Bean
	@Primary
	@Profile({"default","EN"})
	GreetingService2 greetingServiceEnglish(GreetingServiceFactory greetingServiceFactory) {
		return  greetingServiceFactory.createGreetingService("EN");
	}
	
	@Bean
	@Primary
	@Profile("ES")
	GreetingService2 greetingServiceSpanish(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("ES");
	}
	
	@Bean
	@Primary
	@Profile("DE")
	GreetingService2 greetingServiceGerman(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("DE");
	}
}

