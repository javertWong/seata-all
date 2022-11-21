package com.jw.seatatwo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jw")
@MapperScan(basePackages = {"com.jw.seatatwo.mapper"})
public class SeataTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataTwoApplication.class, args);
    }

}
