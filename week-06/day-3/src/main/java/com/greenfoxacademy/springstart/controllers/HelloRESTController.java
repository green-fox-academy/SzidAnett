package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.controllers.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong count = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name){
        return new Greeting(count.addAndGet(1), "Hello, " + name);
    }
}
