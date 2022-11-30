package com.example.demo.controllers;

import com.example.demo.models.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animais")
public class AnimalControle {

    private static final List<Animal> animais = new ArrayList<Animal>();

    public AnimalControle() {
        animais.add(new Animal("Baleia", "Mamífero"));
        animais.add(new Animal("Lagarto", "Réptil"));
        animais.add(new Animal("Pato", "Ave"));
        animais.add(new Animal("Cobra", "Réptil"));
        animais.add(new Animal("Elefante", "Mamífero"));
    }

    @GetMapping
    public String getAnimal(Model model){
        model.addAttribute("animais", animais);
        return "animais";
    }
}
