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

    public Pet(Long id) {
        super(id);
        this.name = "";
        this.petType = new PetType();
        this.owner = new Owner();
        this.birthDate = LocalDate.now();
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
