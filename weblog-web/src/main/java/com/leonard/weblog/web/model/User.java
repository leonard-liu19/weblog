package com.leonard.weblog.web.model;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.*;

/**
 * @projectName: weblog-springboot
 * @package: com.leonard.weblog.web.model
 * @className: User
 * @author: Leonard
 * @description:
 * @date: 2024/1/7 17:23
 * @version: 1.0
 */
@Data
public class User {
    // 用户名
    @NotNull(message = "用户名不能为空")
    private String username;
    // 性别
    @NotNull(message = "性别不能为空")
    private Integer sex;

    // 年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message="年龄必须大于或等于18")
    @Max(value = 100, message="年龄必须小于或等于100")
    private Integer age;

    // 邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;
}