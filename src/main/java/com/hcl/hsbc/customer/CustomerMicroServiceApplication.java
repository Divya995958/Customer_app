package com.hcl.hsbc.customer;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@EnableDiscoveryClient

@SpringBootApplication
public class CustomerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMicroServiceApplication.class, args);
		
		System.out.println("-----------customer main service------");

	}

}
