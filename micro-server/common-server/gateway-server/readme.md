网关服务(zuul)
---
目的：整合多个微服务的访问入口

路由配置
---
```
zuul:
  routes:
   shopping-mall: /mall/**      #服务对应的映射路径

由配置可看出,当存在多个节点的shopping-mall服务时,
各个节点的ip,port各不相同。这样调用shopping-mall
的接口就变得异常困难（不知道要调用哪个服务节点）。
网关就是此类问题的解决方案。
配置中的shopping-mall为服务名,/mall/** 为网关前缀

假设网关服务端口为9090,ip为localhost
shopping-mall服务有一个接口为 /order/getOrderInfo
shopping-mall有两个节点,port分别为 8080,8081,ip都为localhost

如果不使用网关去调用shopping-mall
那么调用就会是 
localhost:8080/order/getOrderInfo 或 localhost:8081/order/getOrderInfo
集成网关后就只有一个入口,并且zuul集成了ribbon,可以实现多个服务节点负载
使用网关调用：localhost:9090/mall/order/getOrderInfo
这样请求就会负载到这两个节点上
```

网关服务高可用
---
```
启动多个网关实服务成集群。
由于网管属于微服务上游。可用nginx或F5手段对网关服务进行负载
从而实现网管服务高可用
```