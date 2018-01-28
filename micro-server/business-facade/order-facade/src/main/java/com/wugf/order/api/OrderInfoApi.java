package com.wugf.order.api;

import com.wugf.order.entity.OrderInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 订单信息远程API接口
 */
@FeignClient("order-server")
@RequestMapping("/order/orderInfoApi")
public interface OrderInfoApi {
    /**
     * 根据订单id获取订单信息
     * @param orderId
     * @return
     */
    @RequestMapping(value = "getOrderInfo", method = RequestMethod.POST)
    OrderInfo getOrderInfoById(@RequestParam("orderId") Integer orderId) throws InterruptedException;
}
