package com.zyl.award.sys.service.impl;

import com.zyl.award.commons.service.impl.BaseMySqlBaseCrudServiceImpl;
import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import com.zyl.award.sys.entity.po.SysUserRole;
import com.zyl.award.sys.mapper.SysUserRoleMapper;
import com.zyl.award.sys.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-30 09:03
 **/
@Service
public class SysUserRoleServiceImpl extends BaseMySqlBaseCrudServiceImpl<SysUserRole,Integer> implements SysUserRoleService {

    @Autowired
    SysUserRoleMapper sysUserRoleMapper;

    @Override
    public SysUserRole getUserRoleByUserId(Integer userId) {
        Example example = new Example(SysUserRole.class);
        example.createCriteria().andEqualTo("userId",userId);
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(example);
        if(sysUserRoles!=null && sysUserRoles.size()==1){
           return sysUserRoles.get(0);
        }else{
            throw new BusinessException(ResultCode.USER_ROLE_ERROR);
        }
    }
}
