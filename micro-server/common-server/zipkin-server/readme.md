微服务接口全链路跟踪服务
---
```
每个为服务都需要整合 zipkin.这样在查询Trace的时候才会显示层级关系
1: 添加以下依赖
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-sleuth-zipkin</artifactId>
</dependency>

2： 添加以下配置
#微服务跟踪平台
spring
  zipkin:
    base-url: http://localhost:9010
  #数据采集 1为100%，生产环境看需求配置
  sleuth:
    sampler:
      percentage: 1.0

3： 访问： http://localhost:9010/
```

整合ELK
---