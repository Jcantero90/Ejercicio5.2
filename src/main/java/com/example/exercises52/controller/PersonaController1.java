package com.example.exercises52.controller;

import com.example.exercises52.model.CityModel;
import com.example.exercises52.model.PersonaModel;
import com.example.exercises52.services.IserviceAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/controlador1")
public class PersonaController1 {
    @Autowired
    PersonaModel addPeople;
    @Autowired
    List<CityModel> cityData;
    @Autowired
    IserviceAdd service;


//http://localhost:8080/controlador1/addPersona
    @GetMapping("/addPersona")
    public PersonaModel addPeople(@RequestHeader Map<String, String> header){
        addPeople = service.addPeople(header.get("name"),header.get("city"),Integer.parseInt(header.get("age")));
        return addPeople;
    }
    public PersonaModel returnPeople(){
        return addPeople;
    }

    //http://localhost:8080/controlador1/addCiudad
    @PostMapping("/addCiudad")
    public String addCity(@RequestBody CityModel city){
    cityData.add(city);
    return "city added!";
    }
    public List<CityModel> returnCity(){
        return cityData;
    }
}
