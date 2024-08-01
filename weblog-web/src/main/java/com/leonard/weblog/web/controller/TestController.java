package com.leonard.weblog.web.controller;
import com.leonard.weblog.common.enums.ResponseCodeEnum;
import com.leonard.weblog.common.exception.BizException;
import com.leonard.weblog.common.utils.Response;
import com.leonard.weblog.web.model.User;
import com.leonard.weblog.common.aspect.ApiOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @projectName: weblog-springboot
 * @package: com.leonard.weblog.web.controller
 * @className: TestController
 * @author: Leonard
 * @description:
 * @date: 2024/1/7 17:24
 * @version: 1.0
 */
@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    // 这里的@Validated告诉Spring需要对User对象执行校验； BindingResult是验证的结果对象，其中包含所有验证错误信息
    public Response test(@RequestBody @Validated User user /*, BindingResult bindingResult*/){
       // 是否存在校验错误
       //  if(bindingResult.hasErrors()){
       //      // 获取校验不通过字段的提示信息
       //      String errorMsg = bindingResult.getFieldErrors()
       //              .stream()
       //              .map(FieldError::getDefaultMessage)
       //              .collect(Collectors.joining(", "));
       //
       //      // return ResponseEntity.badRequest().body(errorMsg);
       //      return Response.fail(errorMsg);
       //  }

        // 返参
        // return ResponseEntity.ok("参数没有任何问题");
        return Response.success();

        // 手动抛异常，入参是前面定义好的异常码枚举，返参统一交给全局异常处理器搞定
        // throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);

        // 主动定义一个运行时异常，分母不能为零
        // int i = 1/0;
        // return Response.success();
    }
}
