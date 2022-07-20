package com.homework.awspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @GetMapping("/saludar")
    public String saludo(){
        return "hola profe Christian";
    }
}
