package manj.springframework.sfdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "dog", "default" })
@Service
public class DogPetServiceImpl implements PetService {

	public String getPetType() {
		return "Dogs are the best!";
	}

}
