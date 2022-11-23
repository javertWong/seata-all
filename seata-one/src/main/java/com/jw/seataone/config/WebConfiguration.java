package com.jw.seataone.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author javertWong
 * @description TODO
 * @date 2022/11/21 15:51
 */
@Configuration
public class WebConfiguration {

    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return new RestTemplate();
    }
}
