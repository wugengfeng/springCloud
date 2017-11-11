package com.wugf.order;

import com.wugf.config.AbstractMicroServerConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wugf.order.dao")
public class OrderServerApplication extends AbstractMicroServerConfig {

	public static void main(String[] args) {
		SpringApplication.run(OrderServerApplication.class, args);
	}
}
