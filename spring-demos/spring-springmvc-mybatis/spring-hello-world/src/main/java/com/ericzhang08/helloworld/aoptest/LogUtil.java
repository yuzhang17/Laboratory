package com.ericzhang08.helloworld.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect

@Component
public class LogUtil {
    @Before(value = "execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public static void logStart(JoinPoint joinPoint) {
        System.out.println("args:" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("method  start");
    }

    @AfterReturning(value = "execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))", returning = "result")
    public static void logReturn(int result) {
        System.out.println("method return value:" + result);
        System.out.println("method return");
    }

    @AfterThrowing(value = "execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))", throwing = "exception", )
    public static void logException(Exception exception) {
        System.out.println("throw exception, exception is...");
    }

    @After("execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public static void logEnd() {
        System.out.println("method end");
    }
}
