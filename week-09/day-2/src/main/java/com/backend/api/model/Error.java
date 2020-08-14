package com.backend.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Error {
    private String error;

    public Error(String error) {
        this.error = error;
    }
}