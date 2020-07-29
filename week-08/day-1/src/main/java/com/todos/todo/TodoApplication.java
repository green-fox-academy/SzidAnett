package com.todos.todo;

import com.todos.todo.model.Todo;
import com.todos.todo.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Bean
    public CommandLineRunner todoDatabase(TodoRepository todoRepository) {
        return args -> {

            todoRepository.save(new Todo("Start the day"));
            todoRepository.save(new Todo("Finish H2 workshop 1"));
            todoRepository.save(new Todo("Finish JPA workshop 2"));
            todoRepository.save(new Todo("Create CRUD project"));


        };
    }

}
