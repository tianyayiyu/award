package com.zyl.award.sys.mapper;

import com.zyl.award.commons.mapperbase.MyMapper;
import com.zyl.award.sys.entity.po.SysRoleMenu;
import com.zyl.award.sys.entity.vo.SysRoleMenuVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMenuMapper extends MyMapper<SysRoleMenu> {

    /**
     * 根据角色ID查找一级菜单信息
     * @param roleId
     * @return
     */
    List<SysRoleMenuVo> getFirstMenuByRoleId(Integer roleId);
}