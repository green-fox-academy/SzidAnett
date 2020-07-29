package com.example.urlshortener.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoredUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String origUrl;
    private String aliasUrl;
    private long hitCounter;

    //public StoredUrl() {
    //}

    public StoredUrl() {
        this.origUrl = origUrl;
        this.aliasUrl = aliasUrl;
        this.hitCounter = hitCounter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrigUrl() {
        return origUrl;
    }

    public void setOrigUrl(String origUrl) {
        this.origUrl = origUrl;
    }

    public String getAliasUrl() {
        return aliasUrl;
    }

    public void setAliasUrl(String aliasUrl) {
        this.aliasUrl = aliasUrl;
    }

    public long getHitCounter() {
        return hitCounter;
    }

    public void setHitCounter(long hitCounter) {
        this.hitCounter = hitCounter;
    }
}
