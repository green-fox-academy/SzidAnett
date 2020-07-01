package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    public Long id;
    public String content;
    public String name;


    public Greeting(Long id, String content, String name){
        this.id = id;
        this.content = content;
        this.name = name;

    }

    public Greeting(long incrementAndGet, String s) {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
