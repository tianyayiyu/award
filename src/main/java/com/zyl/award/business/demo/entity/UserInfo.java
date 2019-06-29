package com.zyl.award.business.demo.entity;

import com.zyl.award.commons.mapperbase.SimpleGenId;
import com.zyl.award.commons.model.po.BasePO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user_info")
public class UserInfo extends BasePO<Integer> {



    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_password")
    private String userPassword;


}