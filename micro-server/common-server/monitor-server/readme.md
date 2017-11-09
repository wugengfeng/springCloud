实时监控服务
---
```
可根据微服务提供推送监控数据端点(/hystrix.stream)实时对该服务的
的接口调用情况进行监控
当然，微服务需要添加以下依赖
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>


优化：
如果需要集成监控服务，需要在微服务的配置文件加上
推送并发限制
#hystrix 查看监控端点 hystrix.stream支持的最大并发
hystrix:
  config:
    stream:
      maxConcurrentConnections: 10

并且在classpath下添加config.properties文件。添加以下属性
hystrix.stream.dashboard.intervalInMilliseconds=3000
以上配置为微服务hystrix.stream端点推送数据的频率，默认为
500毫秒。在yml配置文件或在监控服务管理页面（http://host:port/hystrix）
上配置推送频率皆不起作用。此为spring-cloud-starter-hystrix一个bug

配置监控端点并发数和监控推送频率是为了方式恶意攻击。如果不配置以上两项
在多个客户端同时访问该端点会占用非常高的cpu资源
```