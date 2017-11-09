package com.wugf.order.controller;

import com.wugf.entity.Order;
import com.wugf.order.manager.OrderManager;
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

    @RequestMapping(value = "getOrder", method = {RequestMethod.GET, RequestMethod.POST})
    public Order getOrder(Long id) {
        System.out.println("---------------------------");
        return orderManager.getOrder(id);
    }
}
