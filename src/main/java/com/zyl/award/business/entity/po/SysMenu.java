package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_menu")
public class SysMenu extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 与存放视图文件夹对应
     */
    @Column(name = "name")
    private String name;

    /**
     * 菜单名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 图标名称
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 直接跳转自定义地址
     */
    @Column(name = "jump")
    private String jump;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 位于第几级
     */
    @Column(name = "level")
    private Short level;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取与存放视图文件夹对应
     *
     * @return name - 与存放视图文件夹对应
     */
    public String getName() {
        return name;
    }

    /**
     * 设置与存放视图文件夹对应
     *
     * @param name 与存放视图文件夹对应
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜单名称
     *
     * @return title - 菜单名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置菜单名称
     *
     * @param title 菜单名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取图标名称
     *
     * @return icon - 图标名称
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标名称
     *
     * @param icon 图标名称
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取直接跳转自定义地址
     *
     * @return jump - 直接跳转自定义地址
     */
    public String getJump() {
        return jump;
    }

    /**
     * 设置直接跳转自定义地址
     *
     * @param jump 直接跳转自定义地址
     */
    public void setJump(String jump) {
        this.jump = jump;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取位于第几级
     *
     * @return level - 位于第几级
     */
    public Short getLevel() {
        return level;
    }

    /**
     * 设置位于第几级
     *
     * @param level 位于第几级
     */
    public void setLevel(Short level) {
        this.level = level;
    }
}