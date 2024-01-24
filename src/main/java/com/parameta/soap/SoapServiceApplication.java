package com.parameta.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EntityScan(basePackages = "com.parameta.soap.entity")
@EnableJpaRepositories(basePackages = "com.parameta.soap.repository")
@EnableWs
public class SoapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapServiceApplication.class, args);
	}
}

