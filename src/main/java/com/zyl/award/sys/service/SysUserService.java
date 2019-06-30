package com.zyl.award.sys.service;

import com.zyl.award.commons.service.BaseCrudService;
import com.zyl.award.sys.entity.dto.LoginDto;
import com.zyl.award.sys.entity.po.SysUser;
import com.zyl.award.sys.entity.vo.SysUserVo;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-29 13:53
 **/
public interface SysUserService extends BaseCrudService<SysUser,Integer> {

    /**
     * 登陆方法
     * @param loginDto
     * @return
     */
    SysUserVo login(LoginDto loginDto);

    /**
     * 注册
     * @param sysUser
     * @return
     */
    SysUserVo register(SysUser sysUser);


}
