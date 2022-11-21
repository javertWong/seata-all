package com.jw.seataone.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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
