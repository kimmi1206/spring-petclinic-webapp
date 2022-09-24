package org.springboot.petclinic.controllers;

import org.springboot.petclinic.services.PetService;
import org.springboot.petclinic.services.VisitService;

public class VisitController {

    private final VisitService visitService;
    private final PetService petService;

    public VisitController(VisitService visitService, PetService petService) {
        this.visitService = visitService;
        this.petService = petService;
    }

}
