package com.example.exercises52.services;

import com.example.exercises52.controller.PersonaController1;
import com.example.exercises52.model.PersonaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyServiceGet implements IserviceGet{

    @Autowired
    PersonaModel peopleObject;

    @Override
    public PersonaModel getObject() {
    return peopleObject;
    }
}
