package com.example.dependency.dependencyday.hello_bean_world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanApplication implements CommandLineRunner {
    Printer printer = new Printer();

    @Autowired
    public HelloBeanApplication (Printer printer){
        this.printer = printer;
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloBeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        printer.log("hello");
    }
}
