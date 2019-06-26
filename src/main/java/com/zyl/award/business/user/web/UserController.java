package com.zyl.award.business.user.web;

import com.zyl.award.annotations.ResponseResult;
import com.zyl.award.business.user.entity.UserInfo;
import com.zyl.award.business.user.service.UserService;
import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@ResponseResult
@Api(tags = "用户管理")
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {



    @Autowired
    private UserService userService;

    @ApiOperation(value = "测试写入用户表（注册）", notes = "测试")
    @PostMapping
    public UserInfo user(UserInfo user) {
        UserInfo userInfo = null;
        userInfo = userService.registerService(user);
        return userInfo;
    }
}
