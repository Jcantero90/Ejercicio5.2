package com.example.exercises52.model;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class PersonaObject {


    @Bean("bean1")
    @Primary
    public PersonaModel bean1(){
        PersonaModel bean1 = new PersonaModel("bean1","city1",22);
        return bean1;
    }
    @Bean("bean2")
    public PersonaModel bean2(){
        PersonaModel bean2 = new PersonaModel("bean2","city2",22);
        return bean2;
    }
    @Bean("bean3")
    public PersonaModel bean3(){
        PersonaModel bean2 = new PersonaModel("bean3","city3",22);
        return bean2;
    }
}
