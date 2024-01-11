package com.curso.springboot.webapp.springbootweb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.springboot.webapp.springbootweb.models.User;


@Controller
public class UserController {

    //metodo handler pues manejara datos y regresara algo
    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Bryan", "Salgado");

        model.addAttribute("title", "Hola Mundo SpringBoot");
        model.addAttribute("user", user);
        return "details";
    }
}
