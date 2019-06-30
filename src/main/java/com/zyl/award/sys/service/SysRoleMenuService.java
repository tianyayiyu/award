package com.zyl.award.sys.service;

import com.zyl.award.commons.model.po.Node;
import com.zyl.award.commons.service.BaseCrudService;
import com.zyl.award.sys.entity.po.SysMenu;
import com.zyl.award.sys.entity.po.SysRoleMenu;
import com.zyl.award.sys.entity.vo.SysRoleMenuVo;

import java.util.List;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-30 10:41
 **/
public interface SysRoleMenuService extends BaseCrudService<SysRoleMenu,Integer> {

    /**
     * 根据角色ID获取菜单
     * @param roleId
     * @return
     */
    List<SysRoleMenuVo> getMenuListByRoleId(Integer roleId);
}
