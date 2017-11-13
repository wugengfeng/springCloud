商城接口服务（服务消费端）
---
```
此服务的接口均为外部接口
所有跨服务间调用全在manager层

此项目的跨服务调用在　OrderInfoApiImpl　中
测试跨服务调用需要开启的服务有
git-config-server
order-server
shopping-mall
user-server
eureka-server
zipkin-server
如果不开启监控服务 zipkin-server 调用 http://localhost:9093/order/getOrderDetail?orderId=1
第一次会报错,原因是采集数据推送到监控服务链接异常
如果确实不需要监控可注释以下依赖
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-sleuth-zipkin</artifactId>
</dependency>

当然也可以开启网关服务(gateway-server)，调用：http://localhost:5000/mall/order/getOrderDetail?orderId=1
```

ribbon
---
```
服务消费端集成 ribbon 实现对远程服务进行负载调用
可配置负载策略
#负载均衡配置
order-server:
  ribbon:
    NFLoadBalancerRuleClassName: com.netflix.loadbalancer.RandomRule
策略有随机，轮询，最小并发请求等

ribbon脱离eureka可实现非spring cloud项目实现负载均衡
ribbon 本身可以维护一个 server List,实现对个server List进行负载
当然还可以集成Feign实现没有eureka的微服务架构

脱离eureka的ribbon配置
ribbon:
  eureka:
   enabled: false   #Ribbon 不使用eureka
  
   
order-server:
  ribbon:
    listOfServers: localhost:9088,localhost:9099   #配置服务列表
此方案可为非spring cloud实现服务间负载及远程restFul调用提供解决方案
```

hystrix
---
```
集成熔断器，防止基础服务挂了导致微服务的“雪崩效应”
跳闸机制：当某个服务的错误率超过一定的阈值时，Hystrix可以手动或者自动跳闸
。停止请求该服务一段时间

资源隔离：Hystrix为每个服务都维护一个小型线程池（或者信号量），如果该线程池
已满，发往依赖的请求就立即拒绝，从而加快失败判定。

监控：Hystrix可以近乎实时监控运行指标和配置的变化，例如成功，失败，超时和被
拒绝等，监控是服务消费端对服务提供端接口调用的监控。

回退机制：当请求失败，超时，被拒绝或者断路器被打开时，执行回退逻辑(fallBack)

自我修复：断路器打开一段时间后，会自动进入“半开状态”。这个状态下只有一个请求
会去请求依赖服务，如果成功，则关闭熔断器。

PS:执行回退逻辑并不代表断路器已经打开，请求失败，超时等都会执行回退逻辑
某个服务就算打开了熔断器，它还是会被ribbon负载到
```
