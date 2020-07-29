package com.myreddit.clone.service;

import com.myreddit.clone.model.ErrorMessage;
import com.myreddit.clone.model.Post;
import com.myreddit.clone.model.RedditUser;
import com.myreddit.clone.repository.ErrorMessageRepository;
import com.myreddit.clone.repository.PostRepository;
import com.myreddit.clone.repository.RedditUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedditService {

    private PostRepository postRepository;
    private RedditUserRepository redditUserRepository;
    private ErrorMessageRepository errorMessageRepository;
    private RedditUser activeUser;


    public RedditService(PostRepository postRepository, RedditUserRepository redditUserRepository) {
        this.postRepository = postRepository;
        this.redditUserRepository = redditUserRepository;
    }

    @Autowired
    RedditService(RedditUserRepository redditUserRepository, PostRepository postRepository,
                  ErrorMessageRepository errorMessageRepository) {
        this.redditUserRepository = redditUserRepository;
        this.postRepository = postRepository;
        this.errorMessageRepository = errorMessageRepository;
    }

    public RedditUser getUserByName(String userName) {
        return redditUserRepository.getRedditUserByRedditUsername(userName);
    }

    public RedditUser getUserById(Long id) {
        return redditUserRepository.getRedditUserByRedditUserId(id);
    }

    public void loadUser(RedditUser redditUser) {
        this.activeUser = redditUser;
    }

    public boolean doesUserExistsWithUserName(String userName) {
        return redditUserRepository.existsByRedditUsername(userName);
    }

    public void createUser(RedditUser redditUser) {
        redditUserRepository.save(redditUser);
    }

    public RedditUser getActiveUser() {
        return activeUser;
    }

    public void createPost(Post post) {
        post.setRedditUser(activeUser);
        postRepository.save(post);
        addPostToUserPosts(post);
    }

    public void addPostToUserPosts(Post post) {
        List<Post> changedPosts = activeUser.getPosts();
        changedPosts.add(post);
        activeUser.setPosts(changedPosts);
        redditUserRepository.save(activeUser);
    }

    public List<Post> getPosts() {
        return postRepository.findAllByOrderByScoreDesc();
    }

    public void upvotePost(Long id) {
        postRepository.findByPostId(id).incScore();
        postRepository.save(postRepository.findByPostId(id));
    }

    public void downvotePost(Long id) {
        postRepository.findByPostId(id).decScore();
        postRepository.save(postRepository.findByPostId(id));
    }

    public void createErrorMessage(String message) {
        errorMessageRepository.save(new ErrorMessage(message));
    }

    public ErrorMessage getErrorMessageByContainsUserName(String userName) {
        return errorMessageRepository.getByMessageContains(userName);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
}
