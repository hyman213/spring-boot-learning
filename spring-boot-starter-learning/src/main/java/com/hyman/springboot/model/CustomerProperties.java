package com.hyman.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/07/28 18:33
 * @version： 1.0.0
 */
@ConfigurationProperties(prefix = "customer")
public class CustomerProperties {

    private static final String DEFAULT_NAME = "Hyman";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
