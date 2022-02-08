package me.cherrue;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
@EnableConfigurationProperties(CherrueProperties.class)
public class SpringinitApplication {
    public static void main(String[] args) {
        // builder 사용
//        new SpringApplicationBuilder()
//                .sources(SpringinitApplication.class)
//                .run(args);
        SpringApplication app = new SpringApplication(SpringinitApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.addListeners(new SampleListener());
        app.run(args);
    }
}
