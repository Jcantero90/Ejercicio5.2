package com.example.exercises52.controller;

import com.example.exercises52.model.PersonaModel;
import com.example.exercises52.services.IserviceAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/controlador1")
public class PersonaController1 {

    @Autowired
    IserviceAdd service;


//http://localhost:8080/controlador1/addPersona
    @GetMapping("/addPersona")
    public PersonaModel addPeople(@RequestHeader Map<String, String> header){
     PersonaModel addPeople = service.addPeople(header.get("name"),header.get("city"),Integer.parseInt(header.get("age")));
        return addPeople;
    }
}
