package manj.springframework.sfdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//@Profile("cat")
@Primary
@Service
public class CatPetServiceImpl implements PetService {
	@Override
	public String getPetType() {
		return "Cats Are the Best!";
	}

}
