package com.iroc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.iroc.spring")
public class EntryPoint {
	public static void main(String[] args) {
		SpringApplication.run(EntryPoint.class, args);
	}

}
