package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableConfigurationProperties
@SpringBootApplication(scanBasePackages="com.example.demo")
public class DemoWebRestSocietyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebRestSocietyApplication.class, args);
	}
}
