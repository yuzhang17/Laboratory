package com.ericzhang08.diveinspringboot.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SecondLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}