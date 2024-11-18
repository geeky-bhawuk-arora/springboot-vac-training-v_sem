package com.springLearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springLearning")
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee("Bhawuk", 20, "bhawuk@gmail.com"); 
    }
}
