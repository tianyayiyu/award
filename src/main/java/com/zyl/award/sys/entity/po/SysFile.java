package com.zyl.award.sys.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_file")
public class SysFile extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 信息ID
     */
    @Column(name = "fid")
    private String fid;

    /**
     * 文件名
     */
    @Column(name = "name")
    private String name;

    /**
     * 图片标识
     */
    @Column(name = "p_title")
    private String pTitle;

    /**
     * 附件类型
     */
    @Column(name = "class_type")
    private String classType;

    /**
     * 文件类型
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 栏目路径ID
     */
    @Column(name = "pathid")
    private String pathid;

    /**
     * 文件大小
     */
    @Column(name = "size")
    private String size;

    /**
     * URL地址
     */
    @Column(name = "url")
    private String url;

    /**
     * 水印图
     */
    @Column(name = "p_shuiyin")
    private String pShuiyin;

    /**
     * 缩略图小
     */
    @Column(name = "p_picmin")
    private String pPicmin;

    /**
     * 缩略图大
     */
    @Column(name = "p_picmax")
    private String pPicmax;

    /**
     * 封面 0 :不为封面 1 ：封面
     */
    @Column(name = "p_cover")
    private Integer pCover;

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
     * 获取信息ID
     *
     * @return fid - 信息ID
     */
    public String getFid() {
        return fid;
    }

    /**
     * 设置信息ID
     *
     * @param fid 信息ID
     */
    public void setFid(String fid) {
        this.fid = fid;
    }

    /**
     * 获取文件名
     *
     * @return name - 文件名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置文件名
     *
     * @param name 文件名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图片标识
     *
     * @return p_title - 图片标识
     */
    public String getpTitle() {
        return pTitle;
    }

    /**
     * 设置图片标识
     *
     * @param pTitle 图片标识
     */
    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    /**
     * 获取附件类型
     *
     * @return class_type - 附件类型
     */
    public String getClassType() {
        return classType;
    }

    /**
     * 设置附件类型
     *
     * @param classType 附件类型
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * 获取文件类型
     *
     * @return type - 文件类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置文件类型
     *
     * @param type 文件类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取栏目路径ID
     *
     * @return pathid - 栏目路径ID
     */
    public String getPathid() {
        return pathid;
    }

    /**
     * 设置栏目路径ID
     *
     * @param pathid 栏目路径ID
     */
    public void setPathid(String pathid) {
        this.pathid = pathid;
    }

    /**
     * 获取文件大小
     *
     * @return size - 文件大小
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置文件大小
     *
     * @param size 文件大小
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取URL地址
     *
     * @return url - URL地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置URL地址
     *
     * @param url URL地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取水印图
     *
     * @return p_shuiyin - 水印图
     */
    public String getpShuiyin() {
        return pShuiyin;
    }

    /**
     * 设置水印图
     *
     * @param pShuiyin 水印图
     */
    public void setpShuiyin(String pShuiyin) {
        this.pShuiyin = pShuiyin;
    }

    /**
     * 获取缩略图小
     *
     * @return p_picmin - 缩略图小
     */
    public String getpPicmin() {
        return pPicmin;
    }

    /**
     * 设置缩略图小
     *
     * @param pPicmin 缩略图小
     */
    public void setpPicmin(String pPicmin) {
        this.pPicmin = pPicmin;
    }

    /**
     * 获取缩略图大
     *
     * @return p_picmax - 缩略图大
     */
    public String getpPicmax() {
        return pPicmax;
    }

    /**
     * 设置缩略图大
     *
     * @param pPicmax 缩略图大
     */
    public void setpPicmax(String pPicmax) {
        this.pPicmax = pPicmax;
    }

    /**
     * 获取封面 0 :不为封面 1 ：封面
     *
     * @return p_cover - 封面 0 :不为封面 1 ：封面
     */
    public Integer getpCover() {
        return pCover;
    }

    /**
     * 设置封面 0 :不为封面 1 ：封面
     *
     * @param pCover 封面 0 :不为封面 1 ：封面
     */
    public void setpCover(Integer pCover) {
        this.pCover = pCover;
    }
}