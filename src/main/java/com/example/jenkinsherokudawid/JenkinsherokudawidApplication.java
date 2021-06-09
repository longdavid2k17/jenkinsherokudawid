package com.example.jenkinsherokudawid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsherokudawidApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsherokudawidApplication.class, args);
    }

    @GetMapping
    public String get()
    {
        return "Hello from get method!";
    }
}
