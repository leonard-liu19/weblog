package com.leonard.weblog.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

}
