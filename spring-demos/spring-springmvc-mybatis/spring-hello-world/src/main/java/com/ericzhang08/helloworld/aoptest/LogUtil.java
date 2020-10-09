package com.ericzhang08.helloworld.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect

@Component
public class LogUtil {

    @Around("pointcut()")
    public static int logAround(ProceedingJoinPoint joinPoint) {
        System.out.println("around start");
        int result = 0;
        try {
            result =  (int)joinPoint.proceed(joinPoint.getArgs());
            System.out.println("around after involk");

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after return");
        return result;
    }

    @Pointcut("execution(public  int com.ericzhang08.helloworld.aoptest.Calculator.*(int, int))")
    public void pointcut(){}

    @Before(value = "pointcut()")
    public static void logStart(JoinPoint joinPoint) {
        System.out.println("args:" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("method  start");
    }

    @AfterReturning(value = "pointcut()", returning = "result")
    public static void logReturn(int result) {
        System.out.println("method return value:" + result);
        System.out.println("method return");
    }

    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public static void logException(Exception exception) {
        System.out.println("throw exception, exception is...");
    }

    @After("pointcut()")
    public static void logEnd() {
        System.out.println("method end");
    }


}
