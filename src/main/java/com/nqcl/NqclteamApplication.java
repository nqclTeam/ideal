package com.nqcl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nqcl.api.dao")
public class NqclteamApplication {

    public static void main(String[] args) {
        SpringApplication.run(NqclteamApplication.class, args);
    }

}
