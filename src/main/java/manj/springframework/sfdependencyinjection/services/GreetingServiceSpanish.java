package manj.springframework.sfdependencyinjection.services;

public class GreetingServiceSpanish implements GreetingService2{

	private GreetingRepository greetingRepository;
	
	public GreetingServiceSpanish(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting2() {

		return greetingRepository.getSpanishGreeting();
	}

}
