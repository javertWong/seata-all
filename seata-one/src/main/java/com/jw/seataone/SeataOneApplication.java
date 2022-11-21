package com.jw.seataone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jw")
@MapperScan(basePackages = {"com.jw.seataone.mapper"})
public class SeataOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataOneApplication.class, args);
    }

}
