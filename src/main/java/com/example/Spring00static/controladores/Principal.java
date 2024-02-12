package com.example.Spring00static.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {

    @GetMapping("/")
    public String inicio(){
        return "index";
    }
}
