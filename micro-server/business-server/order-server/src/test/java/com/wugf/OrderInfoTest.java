package com.wugf;

import com.wugf.order.OrderServerApplication;
import com.wugf.order.entity.OrderInfo;
import com.wugf.order.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileNotFoundException;


//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = OrderServerApplication.class, properties = "spring.profiles.active=local")
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


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test2());
        thread.start();
        thread.join();
        System.out.println("1111111111");
    }
}

class Test2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Test3 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

