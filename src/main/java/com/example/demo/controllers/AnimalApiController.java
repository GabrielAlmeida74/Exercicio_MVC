package com.example.demo.controllers;

import com.example.demo.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/animais")
public class AnimalApiController {

    private static final List<Animal> animais = new ArrayList<Animal>();

    public AnimalApiController() {
        animais.add(new Animal("Baleia", "Mamífero"));
        animais.add(new Animal("Lagarto", "Réptil"));
        animais.add(new Animal("Pato", "Ave"));
        animais.add(new Animal("Cobra", "Réptil"));
        animais.add(new Animal("Elefante", "Mamífero"));
    }

    @GetMapping
    public List<Animal> getAnimals(){
        return animais;
    }
}
