package com.example.demo;

import com.example.demo.config.SpringBootApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

@SpringBootApplication
public class Application {

	//Register SpringBootApplicationContext.class as a Bean
	@Bean
	public SpringBootApplicationContext springApplicationContext() {
		return new SpringBootApplicationContext();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
