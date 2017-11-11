package com.wugf.order.controller;

import com.wugf.order.manager.OrderManager;
import com.wugf.order.vo.OrderVo;
import com.wugf.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器，提供给用户端调用
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderManager orderManager;

    /**
     * 根据订单id获取订单明细接口，此接口主要演示跨服务调用。
     * PS:假设订单明细只需订单+用户数据
     * @param id
     * @return
     */
    @RequestMapping(value = "getOrderDetail", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultVo<OrderVo> getOrder(Integer orderId) {
        return orderManager.getOrderDetailById(orderId);
    }
}
