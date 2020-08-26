package com.ericzhang08.helloworld;

public class PersonInstanceFactory {
    public Person createPerson(String name) {
        return new Person(name, 2, "", "");
    }
}
