package org.springboot.petclinic.services;

import org.springboot.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
