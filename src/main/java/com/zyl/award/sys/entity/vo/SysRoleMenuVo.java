package com.zyl.award.sys.entity.vo;

import com.zyl.award.commons.model.vo.BaseVO;
import lombok.Data;

import java.util.List;


/**
 * @author sunhaijun
 * @description:
 * @create: 2019-06-30 15:09
 **/
@Data
public class SysRoleMenuVo extends BaseVO {

    private Integer roleId;

    private Integer menuId;

    private String name;

    private String title;

    private String icon;

    private String jump;

    private Integer sort;

    private Integer parentId;

    private Short level;

    private List<SysRoleMenuVo> list;

}
