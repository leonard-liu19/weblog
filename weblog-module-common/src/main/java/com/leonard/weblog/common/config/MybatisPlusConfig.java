package com.leonard.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.leonard.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}