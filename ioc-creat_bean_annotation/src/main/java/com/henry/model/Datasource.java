package com.henry.model;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class Datasource {
    @Bean
    public MysqlDataSource mysqlDataSource(@Value("${jdbc.url}") String url,
                                           @Value("${jdbc.username}") String user,
                                           @Value("${jdbc.password}") String password) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        return dataSource;
    }
}
