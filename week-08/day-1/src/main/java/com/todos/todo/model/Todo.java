package com.todos.todo.model;

import javax.persistence.*;

@Entity
@Table
public class Todo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String title;
    Boolean urgent = false;
    Boolean done = false;

    public Todo() {
    }
    
    public Todo(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
