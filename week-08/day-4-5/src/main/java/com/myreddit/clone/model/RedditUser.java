package com.myreddit.clone.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class RedditUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long redditUserId;
    private String redditUsername;
    @OneToMany
    @JoinColumn
    private List<Post> posts = new ArrayList<>();
    private Integer karma;


    public RedditUser() {
    }

    public RedditUser(String redditUsername) {
        this.redditUsername = redditUsername;
    }

    public Long getRedditUserId() {
        return redditUserId;
    }

    public void setRedditUserId(Long redditUserId) {
        this.redditUserId = redditUserId;
    }

    public String getRedditUsername() {
        return redditUsername;
    }

    public void setRedditUsername(String redditUsername) {
        this.redditUsername = redditUsername;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Integer getKarma() {
        return karma;
    }

    public void setKarma(Integer karma) {
        this.karma = karma;
    }
    public void incKarma() {
        this.karma++;
    }

    public void decKarma() {
        this.karma--;
    }
}
