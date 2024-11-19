package com.springLearning;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.springLearning")
public class AppConfig {
	
	@Bean
	public DataSource ds() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_demo1");
		dataSource.setUsername("root");
		dataSource.setPassword("bhawuk42");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jt() {
		return new JdbcTemplate(ds());
	}
}
