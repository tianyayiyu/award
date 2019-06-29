package com.zyl.award.sys.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_dept")
public class SysDept extends BasePO<Integer> {

    /**
     * 上级部门ID，一级部门为0
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 部门名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 排序
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "del_flag")
    private Byte delFlag;



    /**
     * 获取上级部门ID，一级部门为0
     *
     * @return parent_id - 上级部门ID，一级部门为0
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置上级部门ID，一级部门为0
     *
     * @param parentId 上级部门ID，一级部门为0
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取排序
     *
     * @return order_num - 排序
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置排序
     *
     * @param orderNum 排序
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取是否删除  -1：已删除  0：正常
     *
     * @return del_flag - 是否删除  -1：已删除  0：正常
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 设置是否删除  -1：已删除  0：正常
     *
     * @param delFlag 是否删除  -1：已删除  0：正常
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}