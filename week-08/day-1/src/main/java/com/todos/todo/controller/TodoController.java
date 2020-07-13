package com.todos.todo.controller;


import com.todos.todo.model.Todo;
import com.todos.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public String toDo(){
        return "index";
    }
    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        Iterable<Todo> todo = todoRepository.findAll();
        model.addAttribute("todos", todo);
        return "todolist";
    }

}
