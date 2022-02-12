package me.cherrue.demospringmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc : 이걸 붙이면 기본 설정이 다 없어짐
public class WebConfig implements WebMvcConfigurer {
//    void configureAsyncSupport(AsyncSupportConfigurer configurer) {}
}
