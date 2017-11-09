package com.wugf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
@EnableFeignClients
public class StockServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockServerApplication.class, args);
	}
}
