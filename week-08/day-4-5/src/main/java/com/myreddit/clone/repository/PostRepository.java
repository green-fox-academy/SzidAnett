package com.myreddit.clone.repository;

import com.myreddit.clone.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByScoreDesc();
    Post findByPostId(Long postId);
}
