package com.example.externalizedConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExternalizedConfigApplication {

	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "prod");
		SpringApplication.run(ExternalizedConfigApplication.class, args);
	}

}
