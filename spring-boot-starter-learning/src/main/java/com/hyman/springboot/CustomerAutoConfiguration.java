package com.hyman.springboot;

import com.hyman.springboot.model.CustomerProperties;
import com.hyman.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/07/28 18:39
 * @version： 1.0.0
 */
@Configuration
@EnableConfigurationProperties(CustomerProperties.class)
@ConditionalOnClass(CustomerService.class)
@ConditionalOnProperty(prefix = "customer", value = "enabled", matchIfMissing = true)
public class CustomerAutoConfiguration {

    @Autowired
    private CustomerProperties properties;

    @Bean
    @ConditionalOnMissingBean(CustomerService.class)
    public CustomerService customerService() {
        CustomerService customerService = new CustomerService();
        customerService.setName(properties.getName());
        return customerService;
    }

}
