package me.cherrue.demospringmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc : 이걸 붙이면 기본 설정이 다 없어짐
public class WebConfig implements WebMvcConfigurer {
//    void configureAsyncSupport(AsyncSupportConfigurer configurer) {}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("m/**")
                .addResourceLocations("classpath:/m/") // 반드시 /로 끝내야 매핑이 잘 된다.
                .setCachePeriod(20);
    }
}
