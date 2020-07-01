package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FizzBuzz {

    @RequestMapping(value = "/fizzbuzz")
    @ResponseBody
    public List <String> fizzBuzz(@RequestParam int n) {
        final List <String> res = new ArrayList<>();
        final String fizz = "Fizz";
        final String buzz = "Buzz";
        final String woof = "Woof";
        String newline = System.getProperty("line.separator");
        for (int i = 1; i <= n; i++) {
            StringBuilder builder = new StringBuilder();
            if(i % 3 == 0){
                builder.append(fizz);
            }
            if(i % 5 == 0){
                builder.append(buzz);
            }
            if(i % 7 == 0){
                builder.append(woof);
            }
            if(builder.length() == 0){
                builder.append(i);
            }
            builder.append(newline);
            res.add(builder.toString());
        }
        return res;
    }
}













