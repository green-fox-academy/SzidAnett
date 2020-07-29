package com.backend.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {
    private Integer received;
    private Integer result;
    private String error;


    public Doubling(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }
    public Doubling(String errorMessage){
        this.error = errorMessage;
    }
}
