package com.henry.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.henry")
@PropertySource("classpath:jdbc.properties")
@Configuration
public class Config {
}
