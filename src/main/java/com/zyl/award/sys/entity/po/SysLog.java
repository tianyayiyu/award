package com.zyl.award.sys.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_log")
public class SysLog extends BasePO<Integer> {


    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 用户操作
     */
    @Column(name = "operation")
    private String operation;

    /**
     * 响应时间
     */
    @Column(name = "time")
    private Integer time;

    /**
     * 请求方法
     */
    @Column(name = "method")
    private String method;

    /**
     * IP地址
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 请求参数
     */
    @Column(name = "params")
    private String params;



    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户操作
     *
     * @return operation - 用户操作
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 设置用户操作
     *
     * @param operation 用户操作
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 获取响应时间
     *
     * @return time - 响应时间
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置响应时间
     *
     * @param time 响应时间
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 获取请求方法
     *
     * @return method - 请求方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置请求方法
     *
     * @param method 请求方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取IP地址
     *
     * @return ip - IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置IP地址
     *
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取请求参数
     *
     * @return params - 请求参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置请求参数
     *
     * @param params 请求参数
     */
    public void setParams(String params) {
        this.params = params;
    }
}