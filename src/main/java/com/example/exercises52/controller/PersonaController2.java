package com.example.exercises52.controller;

import com.example.exercises52.model.PersonaModel;
import com.example.exercises52.services.IserviceGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador2")
public class PersonaController2 {

    @Autowired
    IserviceGet executable2;


    @GetMapping(value="/getPersona")
    public PersonaModel getName() {
    PersonaModel peopleObject = executable2.getObject();
        return peopleObject;
    }
}
