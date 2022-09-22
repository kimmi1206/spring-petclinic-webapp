package org.springboot.petclinic.services;

import org.springboot.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName(String lastName);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
