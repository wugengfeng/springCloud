package com.wugf.api;

import com.wugf.entity.Order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 订单 Rest Api
 */
@FeignClient(name="order-server")
@RequestMapping("order")
public interface OrderApi {

    @RequestMapping(value = "getOrderInfo", method = RequestMethod.GET)
    Order getOrderInfo(@RequestParam("id") Long id);
}
