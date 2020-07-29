package com.backend.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntil {

    private Integer result;



    public DoUntil sum(Integer until){
        int res = 0;
        for (int i = 0; i <= until; i++){
            res = res + i;
        }
        this.result = res;
        return this;
    }
    public DoUntil factor(Integer until) {
        int res = 1;
        for (int i = 1; i <= until; i++) {
            res = res * i;
        }
        this.result = res;
        return this;
    }
}
