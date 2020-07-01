package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long greetCounter;
    private String name;

    public Greeting(long greetCounter, String content){
        this.greetCounter = greetCounter;
        this.name = content;
    }

    public long getGreetCounter() {
        return greetCounter;
    }

    public String getContent() {
        return name;
    }

}
