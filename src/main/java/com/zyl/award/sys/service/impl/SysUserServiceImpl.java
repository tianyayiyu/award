package com.zyl.award.sys.service.impl;

import com.zyl.award.commons.service.impl.BaseMySqlBaseCrudServiceImpl;
import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import com.zyl.award.sys.entity.dto.LoginDto;
import com.zyl.award.sys.entity.po.SysUser;
import com.zyl.award.sys.entity.vo.SysUserVo;
import com.zyl.award.sys.mapper.SysUserMapper;
import com.zyl.award.sys.service.SysUserService;
import com.zyl.award.utils.JwtUtil;
import com.zyl.award.utils.RegexUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-29 13:54
 **/
@Service
public class SysUserServiceImpl extends BaseMySqlBaseCrudServiceImpl<SysUser,Integer> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUserVo login(LoginDto loginDto) {
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();
        if(RegexUtils.checkMobile(loginDto.getUserName())){
            criteria.andEqualTo("mobile",loginDto.getUserName());
        }else{
            criteria.andEqualTo("userName",loginDto.getUserName());
        }

        String md5Pass = DigestUtils.md5DigestAsHex(loginDto.getPassword().getBytes());
        criteria.andEqualTo("password",md5Pass);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if(!ObjectUtils.isEmpty(sysUsers)){
            SysUserVo sysUserVo = new SysUserVo();
            SysUser sysUser = sysUsers.get(0);
            BeanUtils.copyProperties(sysUser,sysUserVo);
            String token = JwtUtil.createToken(sysUser.getId());
            sysUserVo.setToken(token);
            return sysUserVo;
        }else{
            throw new BusinessException(ResultCode.USER_LOGIN_ERROR);
        }
    }

    @Override
    public SysUserVo register(SysUser sysUser) {
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("mobile",sysUser.getMobile());
        int count = sysUserMapper.selectCountByExample(example);
        if(count>0){
            throw new BusinessException(ResultCode.USER_HAS_EXISTED);
        }
        sysUser.setPassword(DigestUtils.md5DigestAsHex(sysUser.getPassword().getBytes()));
        Integer userId = super.insert(sysUser);
        SysUserVo sysUserVo = new SysUserVo();
        BeanUtils.copyProperties(sysUser,sysUserVo);
        String token = JwtUtil.createToken(userId);
        sysUserVo.setToken(token);
        return sysUserVo;
    }
}
