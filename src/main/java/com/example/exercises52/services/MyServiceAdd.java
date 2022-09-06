package com.example.exercises52.services;

import com.example.exercises52.model.PersonaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
public class MyServiceAdd implements IserviceAdd {



    @Override
    public PersonaModel addPeople(String name, String city, int age) {
        PersonaModel peopleObject = new PersonaModel();
        peopleObject.setName(name);
        peopleObject.setCity(city);
        peopleObject.setAge(age);
        return peopleObject;
    }
}
