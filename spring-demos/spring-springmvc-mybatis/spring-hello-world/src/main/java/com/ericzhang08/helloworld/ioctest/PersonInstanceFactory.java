package com.ericzhang08.helloworld.ioctest;

public class PersonInstanceFactory {
    public Person createPerson(String name) {
        return new Person(name, 2, "", "");
    }
}
