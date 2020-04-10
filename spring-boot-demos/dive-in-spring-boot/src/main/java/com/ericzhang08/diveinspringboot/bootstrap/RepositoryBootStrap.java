package com.ericzhang08.diveinspringboot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ericzhang08.diveinspringboot.repository")
public class RepositoryBootStrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(RepositoryBootStrap.class).web(WebApplicationType.NONE)
                .run(args);
        System.out.println("myfirstRepository:" + ctx.getBean("myFirstLevelRepository"));

        ctx.close();
    }
}
