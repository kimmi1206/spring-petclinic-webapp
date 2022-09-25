package org.springboot.petclinic.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pet extends BaseEntity {

    private String name;

    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;

    private Set<Visit> visits = new HashSet<>();

    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate, Set<Visit> visits) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;

        if (visits == null || visits.size() > 0) {
            this.visits = visits;
        }
    }


}
