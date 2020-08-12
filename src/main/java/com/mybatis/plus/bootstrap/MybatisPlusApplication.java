package com.mybatis.plus.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chenhaowen
 * @Description:
 * @date 2020/8/12 4:16 PM
 */
@SpringBootApplication
@ComponentScan("com.mybatis.plus")
@MapperScan("com.mybatis.plus.mapper")
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
