package com.example.exercises52.services;

import com.example.exercises52.model.PersonaModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public interface IserviceGet {

    public PersonaModel getObject();
}
