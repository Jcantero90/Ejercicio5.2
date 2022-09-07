package com.example.exercises52.controller;

import com.example.exercises52.model.CityModel;
import com.example.exercises52.model.PersonaModel;
import com.example.exercises52.services.IserviceAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/controlador2")
public class PersonaController2 {

    @Autowired
    PersonaController1 executable;
    //http://localhost:8080/controlador2/getPersona
    @GetMapping(value="/getPersona")
    public PersonaModel getAge() {
        return executable.returnPeople();
    }
    //http://localhost:8080/controlador2/getCiudad
    @GetMapping("/getCiudad")
    public List<CityModel> getCity(){
        return executable.returnCity();
    }
}
