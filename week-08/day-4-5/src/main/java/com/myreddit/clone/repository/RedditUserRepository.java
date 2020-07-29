package com.myreddit.clone.repository;

import com.myreddit.clone.model.RedditUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditUserRepository extends CrudRepository<RedditUser, Long> {

    RedditUser getRedditUserByRedditUsername(String userName);
    RedditUser getRedditUserByRedditUserId(Long id);
    boolean existsByRedditUsername(String userName);
}
