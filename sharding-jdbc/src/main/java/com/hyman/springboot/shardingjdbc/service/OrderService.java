package com.hyman.springboot.shardingjdbc.service;

import com.hyman.springboot.shardingjdbc.entity.OrderInfo;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/18 22:06
 * @version： 1.0.0
 */
public interface OrderService {
    List<OrderInfo> queryOrderInfoList(OrderInfo orderInfo);

    OrderInfo queryOrderInfoByOrderId(OrderInfo orderInfo);

    int addOrder(OrderInfo orderInfo);
}
