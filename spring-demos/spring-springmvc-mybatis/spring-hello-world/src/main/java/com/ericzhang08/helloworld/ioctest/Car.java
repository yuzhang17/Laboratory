package com.ericzhang08.helloworld.ioctest;

import lombok.Data;

@Data
public class Car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
