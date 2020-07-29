package com.myreddit.clone.model;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String title;
    private String link;
    private Integer score;

    @ManyToOne
    private RedditUser redditUser;


    public RedditUser getRedditUser() {
        return redditUser;
    }

    public void setRedditUser(RedditUser redditUser) {
        this.redditUser = redditUser;
    }

    public Post(){
        score = 1;

    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
                this.score = score;
    }

    public void incScore(){
        this.score++;
        this.redditUser.incKarma();
    }
    public void decScore(){
        if (score == -3){
            setScore(-3);
        } else {
            this.score--; this.redditUser.decKarma();
        }
   }
}
