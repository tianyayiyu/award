package com.zyl.award.commons.service;


import com.zyl.award.commons.model.po.Node;
import com.zyl.award.commons.model.po.TreePO;

import java.util.List;

/**
 * @desc 树结构查看服务
 */
public interface TreeSelectService<E extends TreePO, PK> {

    /**
     * 根据父节点id获取子节点数据
     *
     * @param parentId 父节点ID
     * @return 子节点数据
     */
    List<E> selectChildren(PK parentId);

    /**
     * 获取当前节点下树数据
     *
     * @param parentId 父节点ID
     * @return 树信息
     */
    Node<E> selectNodeByParentId(PK parentId);

}
