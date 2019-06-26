package com.zyl.award.commons.model.po;


import com.zyl.award.commons.model.Model;

import java.util.Date;

public interface PO<PK> extends Model {
    PK getId();

    void setId(PK id);

    Date getCreateTime();

    void setCreateTime(Date createTime);

    Date getUpdateTime();

    void setUpdateTime(Date updateTime);

}
