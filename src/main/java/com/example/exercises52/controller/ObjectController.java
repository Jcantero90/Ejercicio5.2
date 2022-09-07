package com.example.exercises52.controller;

import com.example.exercises52.Application;
import com.example.exercises52.model.PersonaModel;
import com.example.exercises52.model.PersonaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador")
public class ObjectController {

    @GetMapping("/bean/{bean1}")
    public PersonaModel getBean(@PathVariable("bean1") String bean){
        return (PersonaModel) Application.ex.getBean(bean);
    }

}
