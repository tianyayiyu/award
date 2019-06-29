package com.zyl.award.business.demo.service;

import com.zyl.award.business.demo.entity.UserInfo;
import com.zyl.award.commons.service.BaseCrudService;

/**
 * @desc:
 * @author: create by SunHJ
 * @date:2018/7/6 13:35
 */
public interface UserService extends BaseCrudService<UserInfo,Integer>{

    UserInfo registerService(UserInfo userInfo);
}
