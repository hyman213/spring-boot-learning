package com.hyman.springboot.shardingjdbc;

import com.hyman.springboot.shardingjdbc.entity.OrderInfo;
import com.hyman.springboot.shardingjdbc.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcApplicationTests {

    @Test
    public void contextLoads() {
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ShardingJdbcApplicationTests.class);

    @Resource(name = "orderService")
    OrderService orderService;

    @Test
    public void testInsertOrderInfo() {
        for (int i = 0; i < 1000; i++) {
            long userId = i;
            long orderId = i + 1;
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setUserName("snowalker");
            orderInfo.setUserId(userId);
            orderInfo.setOrderId(orderId);
            int result = orderService.addOrder(orderInfo);
            if (1 == result) {
                LOGGER.info("入库成功,orderInfo={}", orderInfo);
            } else {
                LOGGER.info("入库失败,orderInfo={}", orderInfo);
            }
        }

    }
}
