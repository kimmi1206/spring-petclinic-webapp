package org.springboot.petclinic.controllers;

import org.springboot.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/vets", "/vets.html"})
    public String listVets() {
        return "vets/vets";
    }
}
