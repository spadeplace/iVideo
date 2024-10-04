package com.example.dm_web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dm_web.Dao")
@SpringBootApplication
public class DmWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmWebApplication.class, args);
    }

}
