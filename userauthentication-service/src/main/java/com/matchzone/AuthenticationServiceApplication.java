package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.matchzone.jwtfilter.JWTFilter;

/* This is the main entry point of the application. 
 * A method named jwtFilter() is implemented which will restrict the access of api's based on the JWT Token.
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthenticationServiceApplication {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean jwtFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JWTFilter());
		registrationBean.addUrlPatterns("/api/v1/*");
		return registrationBean;

	}

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServiceApplication.class, args);
	}

	
}
