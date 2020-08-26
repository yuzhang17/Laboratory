package com.ericzhang08.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String lastName;
    private Integer age;
    private String gender;
    private String email;

    public void init() {
        System.out.println("init....");
    }

    public void destroy() {
        System.out.println("destroying...");
    }
}


