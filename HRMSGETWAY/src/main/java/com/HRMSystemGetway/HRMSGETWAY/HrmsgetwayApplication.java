package com.HRMSystemGetway.HRMSGETWAY;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HrmsgetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsgetwayApplication.class, args);
	}

}
