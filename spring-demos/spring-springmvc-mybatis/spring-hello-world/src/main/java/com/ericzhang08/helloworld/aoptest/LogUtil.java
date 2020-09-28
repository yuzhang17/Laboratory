package com.ericzhang08.helloworld.aoptest;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogUtil {
    @Before("execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public static void logStart() {
        System.out.println("method  start");
    }

    @AfterReturning("execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public static void logReturn() {
        System.out.println("method return");
    }

    @AfterThrowing("execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public static void logException() {
        System.out.println("throw exception, exception is...");
    }

    @After("execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public static void logEnd() {
        System.out.println("method end");
    }
}
