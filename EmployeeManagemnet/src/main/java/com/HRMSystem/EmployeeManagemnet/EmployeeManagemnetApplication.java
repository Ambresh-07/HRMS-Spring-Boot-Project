package com.HRMSystem.EmployeeManagemnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeManagemnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagemnetApplication.class, args);
	}

}
