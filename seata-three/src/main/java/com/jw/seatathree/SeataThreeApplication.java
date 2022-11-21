package com.jw.seatathree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jw")
@MapperScan(basePackages = {"com.jw.seatathree.mapper"})
public class SeataThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataThreeApplication.class, args);
    }

}
