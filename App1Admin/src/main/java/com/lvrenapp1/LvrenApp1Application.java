package com.lvrenapp1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lvrenapp1.mapper")
public class LvrenApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(LvrenApp1Application.class, args);
    }

}
