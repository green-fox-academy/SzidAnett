package com.myreddit.clone.repository;

import com.myreddit.clone.model.ErrorMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorMessageRepository extends CrudRepository<ErrorMessage, Long> {
    ErrorMessage getByMessageContains(String userName);
}
