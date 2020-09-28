package com.ericzhang08.helloworld.aoptest;

import com.ericzhang08.helloworld.aoptest.Calculator;
import com.ericzhang08.helloworld.aoptest.LogUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {
    @Autowired
    private Calculator calculator;

    @Test
    void aopTest() {

    }
}