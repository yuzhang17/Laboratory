package com.ericzhang08.helloworld;

public class PersonStaticFactory {
    public static Person createPerson(String name) {
        return new Person(name, 1, "", "");
    }
}
