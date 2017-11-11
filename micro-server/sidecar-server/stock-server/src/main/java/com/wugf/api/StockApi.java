package com.wugf.api;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * 映射非JVM路由
 * Api可以类似像 order-facade一样抽出一个facade工程，这个只是
 * 简单使用sidecar，所以没有单独抽出
 */
@FeignClient("sidecar-stock-server")
public interface StockApi {
    @RequestMapping(value = "getInfo", method = RequestMethod.GET)
    Map<String, Object> getInfo();
}
