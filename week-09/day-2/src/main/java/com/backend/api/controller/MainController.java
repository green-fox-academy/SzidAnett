package com.backend.api.controller;

import com.backend.api.model.*;
import com.backend.api.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MainController {


    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public ResponseEntity<? extends Object> doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new Error("Please provide an input!"));
        }
        return ResponseEntity.status(200).body(new Doubling(input, input * 2));
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<? extends Object> greeter(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.status(400).body(new Error("Please provide a name and a title!"));
        }
        if (name == null){
            return ResponseEntity.status(400).body(new Error("Please provide a name!"));
        }
        if (title == null) {
            return ResponseEntity.status(400).body(new Error("Please provide a title!"));
        } else {
            return ResponseEntity.status(200).body(new Greeter(name,title));
        }

    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public ResponseEntity<? extends Object> appendA(@PathVariable String appendable){
        return ResponseEntity.status(200).body(new AppendA(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<? extends Object> doUntil(@PathVariable String action, @RequestBody Map<String, Integer> doing){
        if (doing.get("until") == null){
            return ResponseEntity.ok().body(new Error("Please provide a number!"));
        }
        if (action.equals("sum")){
            return ResponseEntity.ok().body(new DoUntil().sum(doing.get("until")));
        }
        if (action.equals("factor")) {
            return ResponseEntity.ok().body(new DoUntil().factor(doing.get("until")));
        }
        return null;
    }
}
