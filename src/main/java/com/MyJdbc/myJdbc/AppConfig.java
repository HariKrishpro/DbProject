package com.MyJdbc.myJdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.MyJdbc.myJdbc")
public class AppConfig {

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(new DriverManagerDataSource("jdbc:mysql://localhost/jdbcapi","root",""));
    }


}
