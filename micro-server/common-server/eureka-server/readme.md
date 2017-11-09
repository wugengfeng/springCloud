服务注册中心
---
```
eureka 服务是所有微服务的注册中（作用类似dubbo往zk上注册）

建议：在非生产环境中，一般只需要跑一个注册中心即可。所以单
节点的eureka server不需要将自己往配置中心注册，也不需要获
取eureka server服务上的注册信息，因为它本身就是一个注册中心
eureka:
  client:
    #是否将自己注册到 eureka服务中
    registerWithEureka: false
    #是否获取eureka服务的注册信息，eureka集群才使用
    fetchRegistry: false

```

eureka basic加密
---
```
basic加密主要是针对访问eureka 服务注册管理页面时需要输入账号密码
需要添加以下依赖
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>

application.yml配置文件中添加
security:
  basic:
    enabled: true                                     #开启基于http的basic验证
  user:
    name: wugf
    password: 123456
    
设置加密后,微服务配置 eureka 注册地址需要账号密码
格式为 http:user:password@localhost:port/eureka
```


eureka 高可用
---
```
PS:建议在生产环境使用
eureka 高可用解决方案可以启动多个服务节点
节点之间相互注册和相互获取对方服务注册表上的信息

例如:
服务1配置
server:
  port: 8761
spring:
  application:
    name: eureka-server  
eureka:
  client:
  registerWithEureka: true
  fetchRegistry: true
    serviceUrl:
      defaultZone: http://host2:8762/eureka

      
服务2配置
server:
  port: 8762
spring:
  application:
    name: eureka-server
eureka:
  client:
  registerWithEureka: true
  fetchRegistry: true
    serviceUrl:
      defaultZone: http://host1:8761/eureka
这样两个注册中心服务就可以相互同步服务注册列表

微服务配置多个注册中心地址可以用多个逗号隔开,如下
...
eureka:
  client:
    serviceUrl:
      defaultZone: http://host1:8761/eureka,http://host2:8762/eureka
...

这样配置之后假如当8761端口这个服务挂了,微服务就会往8762这个端口的服务去注册
```

eureka 提供的端点
---
| Http方法        | 路径           | 描述  |
| ------------- |:-------------:| -----|
| GET | /eureka/apps | 获取整张服务注册表的服务注册信息 |
| GET | /eureka/apps/appId | 获取appId服务在注册表的信息(可能多个) |
| GET | /eureka/apps/appId/instanceId | 获取appId服务的某个实例信息（一个） |
| GET | /instances/instanceId | 直接通过instanceId获取注册表上实例的信息 |
```
appId:应用程序的名称 
instanceId：服务实例的唯一标识

这些端点返回的是eureka上的服务注册表信息（xml格式）
返回的数据包括微服务名称,实例标识,服务所在ip,端口,主机名称,服务状态等信息

PS:在非JAVA语言服务调用spring cloud微服务时,无法使用
eureka + ribbon实现的高可用负载。为实现调用的高可用性。
可在非java语言项目维护一个服务注册列表,定期获取服务注册
列表的最新消息。根据注册表返回服务注册信息实现负载算法
（比如返回多个user实例,先判断服务状态是否可达,然后随机获
取其中一个节点的ip+port,调用这个服务的接口）,从而实现非
java服务调用spring cloud微服务的高可用。
```