package com.ericzhang08.helloworld.ioctest;

public class PersonStaticFactory {
    public static Person createPerson(String name) {
        return new Person(name, 1, "", "");
    }
}
