package com.wugf.apiImpl;

import com.wugf.api.OrderApi;
import com.wugf.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单远程接口实现
 */
@RestController
@RefreshScope
public class OrderApiImpl implements OrderApi {

    @Value("${key}")
    private String key;

    @Autowired
    private Environment environment;

    @Override
    public Order getOrderInfo(Long id) {
        Order order = new Order();
        order.setId(1L);
        String profile = environment.getActiveProfiles()[0];
        /*if (profile.equals("local")) {
            throw new RuntimeException("抛出异常");
        }*/
        System.out.println(profile);
        return order;
    }

    @RequestMapping("getKey")
    public Map getPort(){
        Map map = new HashMap();
        map.put("key", key);
        return map;
    }

}
