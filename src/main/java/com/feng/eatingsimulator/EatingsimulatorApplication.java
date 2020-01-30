package com.feng.eatingsimulator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.feng.eatingsimulator.dao.mapper")
public class EatingsimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EatingsimulatorApplication.class, args);
    }

}
