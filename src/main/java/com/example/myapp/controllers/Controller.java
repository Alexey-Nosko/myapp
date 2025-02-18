package com.example.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hand")
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world Version 34";
    }
}
