package com.zyl.award.sys.service;

import com.zyl.award.commons.service.BaseCrudService;
import com.zyl.award.sys.entity.po.SysUserRole;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-30 09:02
 **/
public interface SysUserRoleService extends BaseCrudService<SysUserRole,Integer> {

    /**
     * 通过userId查询用户权限
     * @param userId
     * @return
     */
    SysUserRole getUserRoleByUserId(Integer userId);
}
