基于github的配置中心
---
```
github上配置文件的命名规则如下
{application}-{profile}.yml
application: 服务名称
profile: 环境标识

配置文件中 searchPaths 为github上的字目录
目录格式参考：https://github.com/wugengfeng/config.git 的config-local和config-dev文件夹
```

消息总线，自动刷新微服务配置
---
```
需要使用消息中间件 本demo使用rabbitMq
微服务和配置中心都需要添加依赖
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-bus-amqp</artifactId>
</dependency>

配置MQ连接信息
spring：
  rabbitmq:
    host: 39.108.107.103
    port: 8081
    username: guest
    password: guest

在配置类或其他spring组件使用@Value对配置信息进行注入
需要在类级别添加@RefreshScope才会动态更新配置信息

调用configServer上的/bus/refresh 端点进行消息总线发送
使用mq中间件作为消息总线（服务端和客户端）。修改配置文件后主动调用configServer的/bus/refresh
端点进行消息发送，通知各个微服务进行配置刷新
```

configServer自身高可用
---
```
将多个 configServer节点注册到eureka 上
configClient配置配置中心不再以ip+port的形式配置
而是使用 serverId. 进行负载，实现高可用

高可用配置
spring:
  cloud:
    config:
      discovery:
        enabled: true
        service-id: config-server
        
单节点配置
spring:
  cloud:
      config:                                
        enabled: true
        uri: http://localhost:8900
        failFast: true
        
当使用github或svn存储配置文件时，微服务配置中心的配置必须
在项目resorces下的bootstrap.yml文件下。此文件加载优先级
高于application.yml
```
PS:MQ消息总线动态修改配置不用停止服务

