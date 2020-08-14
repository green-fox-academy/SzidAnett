package com.spring.advanced2.model;

import com.google.gson.annotations.SerializedName;

public class StartUp {

    /**
     * this : Tumblr
     * that : Camp Counselors
     */

    @SerializedName("this")
    private String thisX;
    private String that;

    public String getThisX() {
        return thisX;
    }

    public void setThisX(String thisX) {
        this.thisX = thisX;
    }

    public String getThat() {
        return that;
    }

    public void setThat(String that) {
        this.that = that;
    }
}
