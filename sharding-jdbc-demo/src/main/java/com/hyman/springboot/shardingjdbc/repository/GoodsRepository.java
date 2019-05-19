package com.hyman.springboot.shardingjdbc.repository;

import com.hyman.springboot.shardingjdbc.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/19 10:16
 * @version： 1.0.0
 */
@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findAllByGoodsIdBetween(Long goodsId1, Long goodsId2);

    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);
}
