package com.wugf.config;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * 微服务配置基类，用于扩展为服务启动类
 */
//启用eureka
@EnableEurekaClient
//启动远程rest接口调用框架
@EnableFeignClients
//启用熔断器
@EnableCircuitBreaker
@Import({FeignMappingDefaultConfig.class, DataSourceConfig.class})
public abstract class AbstractMicroServerConfig {
}
