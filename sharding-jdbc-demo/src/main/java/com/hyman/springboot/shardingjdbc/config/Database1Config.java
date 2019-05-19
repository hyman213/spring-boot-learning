package com.hyman.springboot.shardingjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/19 10:19
 * @version： 1.0.0
 */
@Data
@ConfigurationProperties(prefix = "database1")
@Component
public class Database1Config {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String databaseName;

    public DataSource createDataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(getDriverClassName());
        ds.setUrl(getUrl());
        ds.setUsername(getUsername());
        ds.setPassword(getPassword());
        return ds;
    }

}
