package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    int counter = 1;
    @RequestMapping(value = "/greeting")
    public Greeting restController(){
        Greeting greeting = new Greeting((long) counter, "Hello, World");
        counter++;
        return greeting;

    }
}
