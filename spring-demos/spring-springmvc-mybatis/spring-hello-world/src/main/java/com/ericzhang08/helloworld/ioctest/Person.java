package com.ericzhang08.helloworld.ioctest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    public Person(String lastName, Integer age, String gender, String email) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    private String lastName;
    private Integer age;
    private String gender;
    private String email;
    private Car car;

    public void init() {
        System.out.println("init....");
    }

    public void destroy() {
        System.out.println("destroying...");
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(Car car) {
        this.car = car;
    }
}


