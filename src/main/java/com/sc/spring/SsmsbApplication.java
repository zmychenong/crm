package com.sc.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sc.spring.mapper")
public class SsmsbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmsbApplication.class, args);
    }

}
