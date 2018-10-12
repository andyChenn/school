package org.scregister;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaServer
@EnableSwagger2
public class RegisterService {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String profile = scanner.nextLine();
		
//		SpringApplication.run(RegisterService.class, args);
		new SpringApplicationBuilder(RegisterService.class).profiles(profile).run(args);
	}

}
