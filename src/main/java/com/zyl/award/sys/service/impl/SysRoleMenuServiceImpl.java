package com.zyl.award.sys.service.impl;

import com.zyl.award.commons.model.po.Node;
import com.zyl.award.commons.service.impl.BaseMySqlBaseCrudServiceImpl;
import com.zyl.award.sys.entity.po.SysMenu;
import com.zyl.award.sys.entity.po.SysRoleMenu;
import com.zyl.award.sys.entity.vo.SysRoleMenuVo;
import com.zyl.award.sys.mapper.SysRoleMenuMapper;
import com.zyl.award.sys.service.SysMenuService;
import com.zyl.award.sys.service.SysRoleMenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-30 10:43
 **/
@Service
public class SysRoleMenuServiceImpl extends BaseMySqlBaseCrudServiceImpl<SysRoleMenu,Integer> implements SysRoleMenuService {

    @Autowired
    SysRoleMenuMapper sysRoleMenuMapper;

    @Autowired
    SysMenuService sysMenuService;

    @Override
    public List<SysRoleMenuVo> getMenuListByRoleId(Integer roleId) {
        //查询出一级节点
        List<SysRoleMenuVo> firstMenuByRoleIdList = sysRoleMenuMapper.getFirstMenuByRoleId(roleId);
        //遍历一级节点查询菜单
        LinkedList<SysRoleMenuVo> linkedList = new LinkedList<>();
        if(firstMenuByRoleIdList!=null){
            Example example = new Example(SysRoleMenu.class);
            example.createCriteria().andEqualTo("roleId",roleId);
            List<SysRoleMenu> sysRoleMenusList = sysRoleMenuMapper.selectByExample(example);
            List<Integer> menuIdList = sysRoleMenusList.stream().map(SysRoleMenu::getMenuId).collect(Collectors.toList());
            for (SysRoleMenuVo sysRoleMenuVo : firstMenuByRoleIdList) {
                Node<SysMenu> nodeMenu = sysMenuService.selectNodeByParentId(sysRoleMenuVo.getMenuId());
                SysRoleMenuVo sysRoleMenuVo1 = build(nodeMenu,menuIdList);
                linkedList.add(sysRoleMenuVo1);
            }
        }

        return linkedList;
    }

    /**
     * 组装成layui菜单需要的格式
     * @param node
     * @param menuIdList
     * @return
     */
    private SysRoleMenuVo build(Node<SysMenu> node, List<Integer> menuIdList){
        SysRoleMenuVo sysRoleMenuVo = new SysRoleMenuVo();
        SysMenu sysMenu = node.getParent();
        BeanUtils.copyProperties(sysMenu,sysRoleMenuVo);
        sysRoleMenuVo.setList(new ArrayList<>());
        if(node.getChildren()==null || node.getChildren().size()==0){
            return sysRoleMenuVo;
        }
        List<SysRoleMenuVo> list =new ArrayList<>();
        for (Node<SysMenu> child : node.getChildren()) {
            if(!menuIdList.contains(child.getParent().getId())){
                continue;
            }
            SysRoleMenuVo sysRoleMenuVo1 = build(child,menuIdList);
            list.add(sysRoleMenuVo1);

        }
        sysRoleMenuVo.setList(list);
       return sysRoleMenuVo;

    }
}
