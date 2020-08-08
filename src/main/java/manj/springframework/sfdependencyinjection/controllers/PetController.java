package manj.springframework.sfdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import manj.springframework.sfdependencyinjection.services.PetService;

@Controller
public class PetController {
	private final PetService petService;

	public PetController(PetService petService) {
		this.petService = petService;
	}

	public String whichPetIsTheBest() {
		return petService.getPetType();
	}
}
