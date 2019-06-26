package com.zyl.award;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zyl.award.**.mapper")
public class AwardApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwardApplication.class, args);
    }

}
