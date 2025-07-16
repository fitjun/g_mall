package com.jun.gmall.order;

import com.jun.gmall.order.entity.OrderEntity;
import com.jun.gmall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallOrderApplicationTests {
    @Autowired
    private OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity entity = new OrderEntity();
        entity.setBillHeader("华为手机");
        entity.setOrderSn("asdfbzxcbadfg432135a4fhafv");
        orderService.save(entity);
        System.out.println("保存成功");
    }

}
