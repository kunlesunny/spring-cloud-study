package com.chenxy.springcloudeurekasingleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaSingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaSingletonApplication.class, args);
	}
}
