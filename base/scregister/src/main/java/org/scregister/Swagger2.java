package org.scregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2 {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(myApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.scregister"))
				.paths(PathSelectors.any())
				.build();
	}
	
	
	private ApiInfo myApiInfo() {
		return new ApiInfoBuilder()
				.title("注册中心API接口文档")
				.contact(new Contact("Chentengfei", "", "13162694832@163.com"))
				.version("v1.0")
				.description("此接口主要为项目中所有的服务提供注册和发现")
				.license("")
				.licenseUrl("")
				.build();
	}
}
