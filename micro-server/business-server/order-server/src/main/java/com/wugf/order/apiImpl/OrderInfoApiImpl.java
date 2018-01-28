package com.wugf.order.apiImpl;

import com.wugf.order.api.OrderInfoApi;
import com.wugf.order.entity.OrderInfo;
import com.wugf.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单信息远程API接口实现
 */
@RestController
public class OrderInfoApiImpl implements OrderInfoApi{

    @Autowired
    private OrderInfoService orderInfoService;

    @Override
    public OrderInfo getOrderInfoById(@RequestParam("orderId") Integer orderId) throws InterruptedException {
        Thread.sleep(2000l);
        throw new RuntimeException();
        //return orderInfoService.searchOrderInfoById(orderId);
    }
}
