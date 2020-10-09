package com.ericzhang08.helloworld.aoptest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CalculatorTest {
    @Autowired
    private Calculator calculator;

    @Test
    void aopTest() {
        System.out.println(calculator.add(1, 2));
    }
}