package com.zyl.award.commons.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-29 13:25
 **/
@Data
public class BaseVO {

    private Integer id;

    private Date createTime;

    private Date updateTime;
}
