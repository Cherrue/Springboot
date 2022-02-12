package me.cherrue.demospringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringmvcApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemospringmvcApplication.class);
        app.run(args);
    }
}
