package com.zyl.award.sys.entity.dto;

import com.zyl.award.annotations.NotBlank;
import lombok.Data;

/**
 * @author sunhaijun
 * @description: 登陆
 * @create: 2019-06-29 13:35
 **/
@Data
public class LoginDto {

    @NotBlank(message = "用户名为空")
    String userName;

    @NotBlank(message = "密码为空")
    String password;


}
