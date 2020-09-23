package com.ericzhang08.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    void testUserService() {
        final UserService userService = (UserService)iocContainer.getBean("userService");
        System.out.println(userService.getUserRepository());
    }

}