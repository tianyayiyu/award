package com.zyl.award.commons.service;


import com.zyl.award.commons.model.po.TreePO;

/**
 * @desc 树结构crud服务
 *
 * @author zhumaer
 * @since 10/18/2017 18:31 PM
 */
public interface TreeCrudService<E extends TreePO, PK> extends
		BaseCrudService<E, PK>,
		TreeSelectService<E, PK> {
}
