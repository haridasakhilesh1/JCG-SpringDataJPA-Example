package com.javacodegeeks.jpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@SpringBootApplication
public class jpa {

    public static void main(String[] args) {
        SpringApplication.run(jpa.class, args);
    }

}


