package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainClass.class, args);
        context.registerShutdownHook();
    }

}
