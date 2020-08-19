package manj.springframework.sfdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "EN", "default" })
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello - English -from I18nEnglishGreetingServiceImpl";
	}
}
