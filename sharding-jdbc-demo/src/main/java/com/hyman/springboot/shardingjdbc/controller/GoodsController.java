package com.hyman.springboot.shardingjdbc.controller;

import com.hyman.springboot.shardingjdbc.entity.Goods;
import com.hyman.springboot.shardingjdbc.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.KeyGenerator;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/19 10:58
 * @version： 1.0.0
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("save")
    public String save() {
        for (int i = 1; i <= 40; i++) {
            Goods goods = new Goods();
            goods.setGoodsId((long) i);
            goods.setGoodsName("shangpin" + i);
            goods.setGoodsType((long) (i + 1));
            goodsRepository.save(goods);
        }
        return "success";
    }

    @GetMapping("select")
    public String select() {
        return goodsRepository.findAll().toString();
    }

    @GetMapping("delete")
    public void delete() {
        goodsRepository.deleteAll();
    }

    @GetMapping("query1")
    public Object query1() {
        return goodsRepository.findAllByGoodsIdBetween(10L, 30L);
    }

    @GetMapping("query2")
    public Object query2() {
        List<Long> goodsIds = new ArrayList<>();
        goodsIds.add(10L);
        goodsIds.add(15L);
        goodsIds.add(20L);
        goodsIds.add(25L);
        return goodsRepository.findAllByGoodsIdIn(goodsIds);
    }


}
