package com.matchzone.personalinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonalInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalInfoApplication.class, args);
	}
}
