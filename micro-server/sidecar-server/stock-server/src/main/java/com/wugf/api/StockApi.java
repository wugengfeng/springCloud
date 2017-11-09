package com.wugf.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * 映射非JVM路由
 */
@FeignClient("sidecar-stock-server")
public interface StockApi {
    @RequestMapping(value = "getInfo", method = RequestMethod.GET)
    Map<String, Object> getInfo();
}
