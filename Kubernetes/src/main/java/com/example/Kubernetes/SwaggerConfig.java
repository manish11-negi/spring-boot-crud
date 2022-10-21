package com.example.Kubernetes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Spring-api-swagger")
				.apiInfo(ApiInfo());
	}

	private ApiInfo ApiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("swagger-crud").description("Spring-swagger-api-Info").version("1.0.0").build();
	}
	
}
