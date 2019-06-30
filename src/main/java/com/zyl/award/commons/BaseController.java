package com.zyl.award.commons;

import com.zyl.award.sys.cache.SysUserCache;
import com.zyl.award.sys.entity.po.SysRole;
import com.zyl.award.sys.entity.po.SysUser;
import com.zyl.award.sys.entity.vo.SysUserVo;
import com.zyl.award.sys.service.SysRoleMenuService;
import com.zyl.award.sys.service.SysRoleService;
import com.zyl.award.sys.service.SysUserRoleService;
import com.zyl.award.sys.service.SysUserService;
import com.zyl.award.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sunhaijun
 * @description: 基础Controller
 * @create: 2019-06-29 13:02
 **/
@Slf4j
public class BaseController {

    private static final String AUTHORIZATION = "token";

    @Autowired
    SysUserService sysUserService;

    @Autowired
    SysUserRoleService sysUserRoleService;

    @Autowired
    SysRoleMenuService sysRoleMenuService;

    @Autowired
    SysRoleService sysRoleService;

    @Autowired
    SysUserCache sysUserCache;

    @Autowired
    private HttpServletRequest httpServletRequest;

    protected SysUserVo getUserInfo(){

        String token = httpServletRequest.getHeader(AUTHORIZATION);
        Integer userId = JwtUtil.getAppUID(token);
        SysUserVo sysUserVo = sysUserCache.getValue(userId);
        if(ObjectUtils.isEmpty(sysUserVo.getId())){
             sysUserVo = new SysUserVo();
            SysUser sysUser = sysUserService.selectByPk(userId);
            BeanUtils.copyProperties(sysUser,sysUserVo);
            Integer roleId = sysUserRoleService.getUserRoleByUserId(userId).getRoleId();
            sysUserVo.setRoleId(roleId);
            SysRole sysRole = sysRoleService.selectByPk(roleId);
            sysUserVo.setRoleName(sysRole.getRoleName());
            sysUserCache.put(userId,sysUserVo);

        }
        return sysUserVo;
    }
}
