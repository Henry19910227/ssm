package com.henry.config;

import com.henry.interceptor.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan("com.henry")
@EnableWebMvc
public class Config implements WebMvcConfigurer {

//    @Bean
//    public RequestMappingHandlerMapping handlerMapping() {
//        return new RequestMappingHandlerMapping();
//    }
//
//    @Bean
//    public RequestMappingHandlerAdapter handlerAdapter() {
//        return new RequestMappingHandlerAdapter();
//    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor()).addPathPatterns("/user/**").excludePathPatterns("/user/addUser");
    }
}
