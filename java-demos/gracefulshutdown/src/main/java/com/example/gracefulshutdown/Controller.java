package com.example.gracefulshutdown;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController("/")
public class Controller {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting() throws InterruptedException {
        System.out.println("start at" + LocalTime.now());
        System.out.println("finish at" + LocalTime.now());
        return "hello world";
    }
}
