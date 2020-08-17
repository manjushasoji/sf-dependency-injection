package manj.springframework.sfdependencyinjection.services;

public class GreetingServiceEnglish implements GreetingService2 {

	private GreetingRepository greetingRepository;

	public GreetingServiceEnglish(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting2() {

		return greetingRepository.getEnglishGreeting();
	}

}
