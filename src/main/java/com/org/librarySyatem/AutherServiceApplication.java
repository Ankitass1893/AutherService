package com.org.librarySyatem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.org.librarySyatem.feign")  // Enable Feign

public class AutherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutherServiceApplication.class, args);
	}

}
