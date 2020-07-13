package com.todos.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {



    @GetMapping("/todo")
    public String toDo(){
        return "index";
    }
    @GetMapping(value = {"/", "/list"})
    @ResponseBody
    public String list() {
        return "This is my first Todo";
    }

}
