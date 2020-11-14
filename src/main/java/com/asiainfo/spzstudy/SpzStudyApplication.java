package com.asiainfo.spzstudy;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.asiainfo.spzstudy.mapper")
public class SpzStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpzStudyApplication.class, args);
    }

}
