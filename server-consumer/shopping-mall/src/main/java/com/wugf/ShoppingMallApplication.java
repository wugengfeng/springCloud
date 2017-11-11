package com.wugf;

import com.wugf.config.FeignMappingDefaultConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@Import({FeignMappingDefaultConfig.class})
public class ShoppingMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingMallApplication.class, args);
	}
}
