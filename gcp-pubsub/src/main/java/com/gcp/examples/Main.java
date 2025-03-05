package com.gcp.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public Function<String, String> runCloudFunction() {
        return input -> {
            System.out.println("Input: " + input);
            return input + " from Cloud Function";
        };
    }
}