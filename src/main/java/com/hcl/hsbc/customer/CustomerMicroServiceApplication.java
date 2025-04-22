package com.hcl.hsbc.customer;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@EnableDiscoveryClient

@SpringBootApplication
public class CustomerMicroServiceApplication {

<<<<<<< Updated upstream
//103 logit of jiragit
public void m3(){
//gjkjh}
=======
//jira 102
public void m2(){
//logic

}
>>>>>>> Stashed changes

	public static void main(String[] args) {
		SpringApplication.run(CustomerMicroServiceApplication.class, args);
		
		System.out.println("-----------customer main service------");

String name="Divya";
String place="hyd";
String name1="Java";

	}
}
