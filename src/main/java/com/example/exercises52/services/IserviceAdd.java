package com.example.exercises52.services;

import com.example.exercises52.model.PersonaModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

@Service
public interface IserviceAdd {


    PersonaModel addPeople(String name, String city, int Age);
}
