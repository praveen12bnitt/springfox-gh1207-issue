package com.manh.cp;

import com.manh.cp.feign.SampleFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class SampleSwaggerApplication  {


	// This will force feign context to be initialized.
	// Comment this like and everything works.
	@Autowired
	private SampleFeignClient universityConsumerService;

	public static void main(String[] args) {
		SpringApplication.run(SampleSwaggerApplication.class, args);
	}

	@Bean
	public Docket restApiSwaggerDoc() {

		ApiInfo apiInfo = new ApiInfoBuilder().title("REST API Documentation")
				.description("Rest API description")
				.build();
		return new Docket(DocumentationType.SWAGGER_2)
				.enable(true)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(regex("/api.*"))
				.build().pathMapping("/")
				.apiInfo(apiInfo);
	}



}
