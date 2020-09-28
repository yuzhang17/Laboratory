package com.ericzhang08.helloworld;

import com.ericzhang08.helloworld.ioctest.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(locations = "classpath:ioc.xml")
@ExtendWith(SpringExtension.class)
public class PersonTest {
    ApplicationContext iocContainer = null;

    /**
     * test get beans
     */

    @BeforeEach
    void setUp() {
        iocContainer = new ClassPathXmlApplicationContext("ioc.xml");

    }

    @Test
    void testGetBean() {
        Person person = (Person) iocContainer.getBean("person01");
        System.out.println(person);
//        Person person1 = iocContainer.getBean(Person.class);
//        System.out.println(person1);
    }

    @Test
    void testInitBeanByConstructorArg() {
        Person person02 = (Person)iocContainer.getBean("person02");
        System.out.println(person02);
    }

    @Test
    void testPNamespace() {
        Person person03 = (Person)iocContainer.getBean("person03");
        System.out.println(person03);
    }

    @Test
    void testNoArgConstructor() {
        Person person04 = (Person)iocContainer.getBean("person04");
        System.out.println(person04);
    }

    @Test
    void testStaticPersonFactory() {
        Person person04 = (Person)iocContainer.getBean("static_person");
        System.out.println(person04);
    }

    @Test
    void testInstancePersonFactory() {
        Person person = (Person)iocContainer.getBean("instance_person");
        System.out.println(person);
    }

    @Test
    void testPersonFactoryBeanFactory() {
        Person person = (Person)iocContainer.getBean("factory-bean_person");
        System.out.println(person);
    }

    @Test
    void testInitAndDestroy() {
        Person person = (Person) iocContainer.getBean("test_destroy_person");
        System.out.println("test...");
    }

    @Test
    void testAutowired() {
        Person person = (Person) iocContainer.getBean("person");
        System.out.println("test..." + person.getCar().getName());
    }






}
