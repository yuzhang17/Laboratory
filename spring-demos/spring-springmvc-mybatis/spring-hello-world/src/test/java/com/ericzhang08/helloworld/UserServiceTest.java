package com.ericzhang08.helloworld;

import com.ericzhang08.helloworld.ioctest.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceTest {
    private ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    void testUserService() {
        final UserService userService = (UserService)iocContainer.getBean("userService");
        System.out.println(userService.getUserRepository());
    }

}