package com.curso.springboot.webapp.springbootweb.controllers;



import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Se puede dejar tambien solo con el atributo @Controller
@RestController
//Se le coloca la ruta de primer nivel
@RequestMapping("/api")
public class UserRestController {

    //metodo handler pues manejara datos y regresara algo
    @GetMapping("/detailsJson") //El GetMapping y RequestMapping funcionan igual
    //en caso de usar solo el @Controller se debe usar el @RequestBody para regresar el Json
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola Mundo SpringBoot");
        body.put("Name", "Bryan");
        body.put("Lastname", "Salgado");
        return body;
    }
}
