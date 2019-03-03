package com.olegtaranenko.udemy.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("chuck-config.xml")
public class JokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeAppApplication.class, args);
    }

}
