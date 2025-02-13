package com.dcc.trabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.dcc.models")
@ComponentScan(basePackages = "com.dcc")
@EnableJpaRepositories("com.dcc.repositories")
public class TrabalhoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrabalhoApplication.class, args);
    }
}