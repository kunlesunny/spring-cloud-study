package com.chenxy.springcloudservicerabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudServiceRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServiceRabbitmqApplication.class, args);
	}
}
