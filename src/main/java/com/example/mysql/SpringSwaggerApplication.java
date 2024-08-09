package com.example.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerApplication.class, args);
	}
	// create Docket Bean to configure Swagger2 for your Spring Boot application. We
	// need to define the base package to configure REST API(s) for Swagger2.

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.mysql")).build();
	}

}
