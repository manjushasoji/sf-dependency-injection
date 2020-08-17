package manj.springframework.sfdependencyinjection.services;

public class GreetingServiceGerman implements GreetingService2 {

	private GreetingRepository greetingRepository;

	public GreetingServiceGerman(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting2() {

		return greetingRepository.getGermanGreeting();
	}

}
