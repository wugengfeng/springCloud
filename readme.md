目录结构
---
```
common-util
micro-server
    business-facade
    business-server
    common-server
    sidecar-server
parent
server-consumer
```
| 目录       | 说明           |
| ------------- |-------------|
| common-util | 公用工具包目录 |
| micro-server | 基础微服务目录 |
| business-facade| 微服务Api接口目录 |
| business-server| 微服务目录 |
| common-server  | 公共服务目录 |
| sidecar-server | 跨语言集成spring cloud 服务目录|
| parent         | 公共父类工程目录 |
| server-consumer| 微服务消费者目录 |

db脚本github 的db目录下

该微服务架构可解决哪些问题？
---
- 高可用
- 可伸缩
- 统一配置，动态修改配置不停止服务
- 服务的注册与发现以及服务节点宕机踢出
- 服务间的调用负载，容错。防止雪崩效应
- 解决跨服务调用复杂度
- 微服务接口调用实时监控
- 多节点服务进行自动负载
- 网关，统一微服务接口调用
- 规范跨服务调用规则，防止混乱跨服务调用
- 服务接口全链路跟踪，跟踪用户调用的接口跨越多少个服务，每个服务耗时及总耗时
- 非spring cloud工程使用ribbon负载功能及使用Feign
- 持续集成跨语言服务（如node等）