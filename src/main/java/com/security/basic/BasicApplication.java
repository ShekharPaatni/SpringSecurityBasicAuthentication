package com.security.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class BasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}
}
