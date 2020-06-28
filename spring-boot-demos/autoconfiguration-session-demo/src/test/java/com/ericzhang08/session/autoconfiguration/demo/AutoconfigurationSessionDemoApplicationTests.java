package com.ericzhang08.session.autoconfiguration.demo;

import com.ericzhang08.session.autoconfiguration.demo.beans.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest( )
class AutoconfigurationSessionDemoApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;



	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
