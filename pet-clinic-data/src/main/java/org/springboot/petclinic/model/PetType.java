package org.springboot.petclinic.model;

public class PetType extends BaseEntity {

    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
