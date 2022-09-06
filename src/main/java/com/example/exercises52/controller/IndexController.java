package com.example.exercises52.controller;

import com.example.exercises52.model.PersonaModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value={"","/index","/"})
    public String index() {
        return "index";
    }
}
