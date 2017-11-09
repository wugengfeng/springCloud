sidecar 整合非jvm服务，让其可使用eureka特性
---
```
此服务是为整合非JVM服务搭建的。是非JVM服务于eureka连接的
桥梁。让非spring cloud项目也能持续集成到spring cloud中

非jvm服务需要提供一个检查健康状态的接口，本demo配置的是
http://localhost:8050/health 返回：{"status":"UP"}
JVM服务调用非JVM服务可使用Feign

非JVM调用jvm可以调用 http://sidecarServerHost:port/hosts/serverId/xxx
```

集成sidecar的好处
---
```
1:跨语言实现分布式持续集成
2:非jvm也能使用eureka的特性，比如stock-server服务挂了（加入是nodejs服务），在eureka上
sidecar-stock-server服务的状态也会变为dowm
```
