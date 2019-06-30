package com.zyl.award.sys.entity.vo;

import com.zyl.award.commons.model.vo.BaseVO;
import lombok.Data;


/**
 * @author sunhaijun
 * @description: 登陆返回
 * @create: 2019-06-29 13:20
 **/
@Data
public class SysUserVo extends BaseVO {

    private Integer deptId;

    private String userName;

    private String nickName;

    private String realName;

    private String mobile;

    private String token;

    private Integer roleId;

    private String roleName;



}
