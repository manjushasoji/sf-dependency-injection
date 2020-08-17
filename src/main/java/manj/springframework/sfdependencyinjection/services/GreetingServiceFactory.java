package manj.springframework.sfdependencyinjection.services;

public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService2 createGreetingService(String lang) {
		
		switch (lang) {
			case "EN":
				return new GreetingServiceEnglish(greetingRepository);
			case "DE":
				return new GreetingServiceGerman(greetingRepository);
			case "ES":
				return new GreetingServiceSpanish(greetingRepository);
			default:
				return new GreetingServiceEnglish(greetingRepository);

		}
	}

}
