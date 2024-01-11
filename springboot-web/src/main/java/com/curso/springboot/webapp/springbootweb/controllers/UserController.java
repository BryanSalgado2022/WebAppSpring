package com.curso.springboot.webapp.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    //metodo handler pues manejara datos y regresara algo
    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hola Mundo SpringBoot");
        model.put("Name", "Bryan");
        model.put("Lastname", "Salgado");
        return "details";
    }
}
