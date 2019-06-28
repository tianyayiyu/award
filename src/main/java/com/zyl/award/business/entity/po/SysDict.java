package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_dict")
public class SysDict extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "dict_key")
    private String dictKey;

    @Column(name = "dict_value")
    private String dictValue;

    @Column(name = "catalog_id")
    private Integer catalogId;

    @Column(name = "sort")
    private Integer sort;

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
     * @return dict_key
     */
    public String getDictKey() {
        return dictKey;
    }

    /**
     * @param dictKey
     */
    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    /**
     * @return dict_value
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * @param dictValue
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * @return catalog_id
     */
    public Integer getCatalogId() {
        return catalogId;
    }

    /**
     * @param catalogId
     */
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
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
}