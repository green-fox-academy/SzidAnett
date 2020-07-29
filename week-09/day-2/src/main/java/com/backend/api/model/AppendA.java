package com.backend.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AppendA {
    private String appended;

    public AppendA(String appendableWord) {
        this.appended = appendableWord + "a";
    }

}
