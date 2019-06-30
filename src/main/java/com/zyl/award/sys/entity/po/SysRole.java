package com.zyl.award.sys.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_role")
public class SysRole extends BasePO<Integer> {


    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_sign")
    private String roleSign;



    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_sign
     */
    public String getRoleSign() {
        return roleSign;
    }

    /**
     * @param roleSign
     */
    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign;
    }
}