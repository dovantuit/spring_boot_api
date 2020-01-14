package com.example.postgresdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
// them chu thich chi noi bat dau
@SpringBootApplication
@EnableJpaAuditing
public class PostgresDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(PostgresDemoApplication.class, args);
	}
}
