package com.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    //metodo handler pues manejara datos y regresara algo
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo SpringBoot");
        model.addAttribute("Name", "Bryan");
        model.addAttribute("Lastname", "Salgado");
        return "details";
    }
}
