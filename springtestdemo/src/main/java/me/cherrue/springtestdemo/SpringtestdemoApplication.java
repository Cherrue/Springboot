package me.cherrue.springtestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtestdemoApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringtestdemoApplication.class);
        app.run(args);
    }
}
