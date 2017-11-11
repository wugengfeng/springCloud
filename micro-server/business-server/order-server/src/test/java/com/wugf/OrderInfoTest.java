package com.wugf;

import com.wugf.order.OrderServerApplication;
import com.wugf.order.entity.OrderInfo;
import com.wugf.order.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrderServerApplication.class, properties = "spring.profiles.active=local")
public class OrderInfoTest {

    @Autowired
    private OrderInfoService orderInfoService;

    @Test
    public void test(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setId(1);
        System.out.println("--------------------");
        System.out.println(orderInfoService.search(orderInfo));
    }
}
