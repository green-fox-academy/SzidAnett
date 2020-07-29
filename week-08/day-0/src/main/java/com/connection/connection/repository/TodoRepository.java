package com.connection.connection.repository;

import com.connection.connection.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>  {

}
