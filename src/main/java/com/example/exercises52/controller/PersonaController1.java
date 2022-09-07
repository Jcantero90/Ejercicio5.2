package com.example.exercises52.controller;

import com.example.exercises52.model.CityModel;
import com.example.exercises52.model.PersonaModel;
import com.example.exercises52.model.PersonaObject;
import com.example.exercises52.services.IserviceAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/controlador1")
public class PersonaController1 {
    @Autowired
    PersonaModel addPeople;
    List<CityModel> cityData = new ArrayList<>();
    @Autowired
    IserviceAdd service;
    @Autowired
    PersonaObject executable;

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
    //http://localhost:8080/controlador1/bean
    @GetMapping("/bean/{bean1}")
    @Qualifier("bean1")
    public PersonaModel getBean(){
        return executable.bean1();
    }/*
    @GetMapping("/bean/{bean2}")
    @Qualifier("bean2")
    public PersonaModel getBean1(@PathVariable("bean2")String bean){
        return executable.bean2();
    }
    @GetMapping("/bean/{bean3}")
    @Qualifier("bean3")
    public PersonaModel getBean2(@PathVariable("bean3")String bean){
        return executable.bean3();
    }*/
}
