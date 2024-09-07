package com.leonard.weblog.web;

import com.leonard.weblog.common.domain.dos.UserDO;
import com.leonard.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testLog(){
        log.info("这是一行Info级别日志");
        log.info("这是一行warn级别日志");
        log.info("这是一行Error级别日志");

        // 占位符
        String author = "Leonard";
        log.info("这是一行带有占位符的日志，作者：{}", author);
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("leonard")
                .password("123456")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }


}
