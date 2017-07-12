package com.wds.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eurekaserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaserver2Application.class, args);
	}
}
