package com.leonard.weblog.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @projectName: weblog-springboot
 * @package: com.leonard.weblog.common.utils
 * @className: JsonUtil
 * @author: Leonard
 * @description: JSON 工具类
 * @date: 2024/1/7 14:40
 * @version: 1.0
 */

@Slf4j
public class JsonUtil {
    private static final ObjectMapper INSTANCE = new ObjectMapper();

    public static String toJsonString(Object obj){
        try{
            return INSTANCE.writeValueAsString(obj);
        }catch(JsonProcessingException e){
            return obj.toString();
        }
    }
}
