package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {

    protected AtomicLong greetCounter = new AtomicLong();

    @RequestMapping("/web/greeting")
    @ResponseBody
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("greetCounter", greetCounter.incrementAndGet());
        return "greeting";
    }
}
