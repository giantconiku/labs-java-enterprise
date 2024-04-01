package com.giant.demospringbootapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return runner -> {
            System.out.println("Hello Universe from Spring Boot");
        };
    }

}
