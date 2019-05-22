//package com.hyman.springboot.study.druiddemo.config;
//
//import com.alibaba.druid.filter.Filter;
//import com.alibaba.druid.filter.stat.StatFilter;
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.google.common.collect.Lists;
//import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Description:
// * @author: Hyman
// * @date: 2019/05/22 14:07
// * @version： 1.0.0
// */
//@Configuration
//@Data
//public class DruidConfig {
//
////    private String driverClassName;
////    private String url;
////    private String username;
////    private String password;
////    private int initialSize;
////    private int maxActive;
////    private int minIdle;
////    private long maxWait;
////    private long timeBetweenEvictionRunsMillis;
////    private long minEvictableIdleTimeMillis;
////    private String validationQuery;
////    private boolean testWhileIdle;
////    private boolean testOnBorrow;
////    private boolean testOnReturn;
////    private String filters;
////    private String connectionProperties;
//
//
//    @ConfigurationProperties(prefix = "spring.datasource.druid")
//    @Bean(initMethod = "init", destroyMethod = "close")
//    public DruidDataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
//        return dataSource;
//    }
//
//    @Bean
//    public Filter statFilter() {
//        StatFilter statFilter = new StatFilter();
//        //多长时间定义为慢sql，这里定义为5s
//        statFilter.setSlowSqlMillis(5000);
//        //是否打印出慢日志
//        statFilter.setLogSlowSql(true);
//        //是否将日志合并起来
//        statFilter.setMergeSql(true);
//        return statFilter;
//    }
//
//    //这是配置druid的监控
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
//    }
//
//
//}
