package com.example.bookmyshowcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing

@SpringBootApplication

@ComponentScan(basePackages = {"com.example.bookmyshowcode.controllers", "com.example.bookmyshowcode.services", "com.example.bookmyshowcode.models", "com.example.bookmyshowcode.repositories"})
@EnableJpaRepositories(basePackages = {"com.example.bookmyshowcode.repositories"})
public class BookmyshowcodeApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookmyshowcodeApplication.class, args);
    }

}
