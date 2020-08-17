package manj.springframework.sfdependencyinjection.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "English - Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Spanish - Servicio de Saludo Primario";
	}

	@Override
	public String getGermanGreeting() {
		return "German - Primärer Grußdienst";
	}

}
