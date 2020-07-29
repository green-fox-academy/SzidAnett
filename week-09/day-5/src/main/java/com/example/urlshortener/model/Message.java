package com.example.urlshortener.model;

public class Message {

    private String errorText;

    public Message() {

    }

    public Message(String errorText) {
        this.errorText = errorText;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
