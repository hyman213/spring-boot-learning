package com.hyman.springboot.shardingjdbc.service.impl;

import com.hyman.springboot.shardingjdbc.entity.OrderInfo;
import com.hyman.springboot.shardingjdbc.mapper.OrderMapper;
import com.hyman.springboot.shardingjdbc.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/18 22:07
 * @version： 1.0.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderInfo> queryOrderInfoList(OrderInfo orderInfo) {
        return orderMapper.queryOrderInfoList(orderInfo);
    }

    @Override
    public OrderInfo queryOrderInfoByOrderId(OrderInfo orderInfo) {
        return orderMapper.queryOrderInfoByOrderId(orderInfo);
    }

    @Override
    public int addOrder(OrderInfo orderInfo) {
        LOGGER.info("订单入库开始，orderinfo={}", orderInfo.toString());
        return orderMapper.addOrder(orderInfo);
    }
}
