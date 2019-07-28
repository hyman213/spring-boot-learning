package com.hyman.springboot.service;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/07/28 18:38
 * @version： 1.0.0
 */
public class CustomerService {

    private String name;

    public String findCustomer() {
        return "The Customer is " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
