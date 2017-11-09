package com.wugf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MonitorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorServerApplication.class, args);
	}
}
