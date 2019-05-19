package com.hyman.springboot.shardingjdbc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/19 10:13
 * @version： 1.0.0
 */
@Data
@Entity
@Table(name = "goods")
public class Goods {
    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;

}
