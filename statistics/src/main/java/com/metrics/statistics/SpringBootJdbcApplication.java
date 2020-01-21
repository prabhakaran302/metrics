package com.metrics.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}