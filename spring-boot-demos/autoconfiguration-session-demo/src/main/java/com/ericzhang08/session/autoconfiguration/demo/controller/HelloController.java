package com.ericzhang08.session.autoconfiguration.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello World";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "hello");
        map.put("users", Arrays.asList("zhangsan", "lisi", "tom"));
        return "success";
    }
}
