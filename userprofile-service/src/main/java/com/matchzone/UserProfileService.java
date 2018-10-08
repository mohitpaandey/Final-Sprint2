package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient // for eureka server to find this application
@ComponentScan(basePackages="com.matchzone")
public class UserProfileService {

	public static void main(String[] args) {
		SpringApplication.run(UserProfileService.class, args);
	}
}
