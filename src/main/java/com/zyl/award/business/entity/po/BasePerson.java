package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_person")
public class BasePerson extends BasePO<Integer> {
    /**
     * 人员主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 人员姓名
     */
    @Column(name = "person_name")
    private String personName;

    /**
     * 年份
     */
    @Column(name = "award_year")
    private Short awardYear;

    /**
     * 专业ID
     */
    @Column(name = "cat_id")
    private Integer catId;

    /**
     * 专业名称
     */
    @Column(name = "cat_name")
    private String catName;

    /**
     * 人员编码
     */
    @Column(name = "person_code")
    private Integer personCode;

    /**
     * 人员附件数量
     */
    @Column(name = "person_file_num")
    private Short personFileNum;

    /**
     * 奖项id
     */
    @Column(name = "award_type_id")
    private Integer awardTypeId;

    /**
     * 奖项名称
     */
    @Column(name = "award_type_name")
    private String awardTypeName;

    @Column(name = "first_prize_id")
    private Integer firstPrizeId;

    @Column(name = "first_prize_name")
    private String firstPrizeName;

    /**
     * 0初评未通过1初评通过
     */
    @Column(name = "first_result")
    private Byte firstResult;

    @Column(name = "final_prize_id")
    private Integer finalPrizeId;

    @Column(name = "final_prize_name")
    private String finalPrizeName;

    @Column(name = "final_result")
    private Byte finalResult;

    /**
     * 0为初评人员管理，1为终评人员管理或是通过初评的人员
     */
    @Column(name = "k_type")
    private Short kType;

    /**
     * 性别
     */
    @Column(name = "k_sex")
    private String kSex;

    /**
     * 年龄
     */
    @Column(name = "k_age")
    private Integer kAge;

    /**
     * 单位
     */
    @Column(name = "k_dept")
    private String kDept;

    /**
     * 学历
     */
    @Column(name = "k_education")
    private String kEducation;

    /**
     * 职称
     */
    @Column(name = "k_title")
    private String kTitle;

    /**
     * 职务
     */
    @Column(name = "k_duties")
    private String kDuties;

    /**
     * 获奖情况_国家级_数量
     */
    @Column(name = "k_winning_country_number")
    private Integer kWinningCountryNumber;

    /**
     * 获奖情况_国家级_级别
     */
    @Column(name = "k_winning_country_level")
    private String kWinningCountryLevel;

    /**
     * 获奖情况_国家级_排名前三数量
     */
    @Column(name = "k_winning_country_ranking")
    private Integer kWinningCountryRanking;

    /**
     * 获奖情况_省部级_数量
     */
    @Column(name = "k_winning_province_number")
    private Integer kWinningProvinceNumber;

    /**
     * 获奖情况_省部级_级别
     */
    @Column(name = "k_winning_province_level")
    private String kWinningProvinceLevel;

    /**
     * 获奖情况_省部级前三数量
     */
    @Column(name = "k_winning_province_ranking")
    private Integer kWinningProvinceRanking;

    /**
     * 获奖情况_局级_数量
     */
    @Column(name = "k_winning_bureau_number")
    private Integer kWinningBureauNumber;

    /**
     * 获奖情况_局级_级别
     */
    @Column(name = "k_winning_bureau_level")
    private String kWinningBureauLevel;

    /**
     * 获奖情况_局级_排名
     */
    @Column(name = "k_winning_bureau_ranking")
    private Integer kWinningBureauRanking;

    /**
     * 行业学会、协会及其他
     */
    @Column(name = "k_association")
    private Integer kAssociation;

    /**
     * 专利情况_发明_数量
     */
    @Column(name = "k_patent_invention_number")
    private Integer kPatentInventionNumber;

    /**
     * 专利情况_发明_级别
     */
    @Column(name = "k_patent_invention_level")
    private String kPatentInventionLevel;

    /**
     * 专利情况_发明_排名前三数量
     */
    @Column(name = "k_patent_invention_ranking")
    private Integer kPatentInventionRanking;

    /**
     * 专利情况_实用新型_数量
     */
    @Column(name = "k_patent_practical_number")
    private Integer kPatentPracticalNumber;

    /**
     * 专利情况_实用新型_级别
     */
    @Column(name = "k_patent_practical_level")
    private String kPatentPracticalLevel;

    /**
     * 专利情况_实用新型_排名
     */
    @Column(name = "k_patent_practical_ranking")
    private Integer kPatentPracticalRanking;

    /**
     * 版权软件专利数量
     */
    @Column(name = "k_copyright_number")
    private Integer kCopyrightNumber;

    /**
     * 论文著作_SCI
     */
    @Column(name = "k_sci")
    private Integer kSci;

    /**
     * 论文著作_EI
     */
    @Column(name = "k_ei")
    private Integer kEi;

    /**
     * 核心期刊
     */
    @Column(name = "k_kernel")
    private Integer kKernel;

    /**
     * 著作
     */
    @Column(name = "k_work")
    private Integer kWork;

    /**
     * 项目名称
     */
    @Column(name = "k_projectname")
    private String kProjectname;

    /**
     * 负担职责
     */
    @Column(name = "k_responsibility")
    private String kResponsibility;

    /**
     * 人员信息
     */
    @Column(name = "person_info")
    private String personInfo;

    /**
     * 备注
     */
    @Column(name = "k_remarks")
    private String kRemarks;

    /**
     * 获取人员主键
     *
     * @return id - 人员主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置人员主键
     *
     * @param id 人员主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取人员姓名
     *
     * @return person_name - 人员姓名
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 设置人员姓名
     *
     * @param personName 人员姓名
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * 获取年份
     *
     * @return award_year - 年份
     */
    public Short getAwardYear() {
        return awardYear;
    }

    /**
     * 设置年份
     *
     * @param awardYear 年份
     */
    public void setAwardYear(Short awardYear) {
        this.awardYear = awardYear;
    }

    /**
     * 获取专业ID
     *
     * @return cat_id - 专业ID
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * 设置专业ID
     *
     * @param catId 专业ID
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * 获取专业名称
     *
     * @return cat_name - 专业名称
     */
    public String getCatName() {
        return catName;
    }

    /**
     * 设置专业名称
     *
     * @param catName 专业名称
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * 获取人员编码
     *
     * @return person_code - 人员编码
     */
    public Integer getPersonCode() {
        return personCode;
    }

    /**
     * 设置人员编码
     *
     * @param personCode 人员编码
     */
    public void setPersonCode(Integer personCode) {
        this.personCode = personCode;
    }

    /**
     * 获取人员附件数量
     *
     * @return person_file_num - 人员附件数量
     */
    public Short getPersonFileNum() {
        return personFileNum;
    }

    /**
     * 设置人员附件数量
     *
     * @param personFileNum 人员附件数量
     */
    public void setPersonFileNum(Short personFileNum) {
        this.personFileNum = personFileNum;
    }

    /**
     * 获取奖项id
     *
     * @return award_type_id - 奖项id
     */
    public Integer getAwardTypeId() {
        return awardTypeId;
    }

    /**
     * 设置奖项id
     *
     * @param awardTypeId 奖项id
     */
    public void setAwardTypeId(Integer awardTypeId) {
        this.awardTypeId = awardTypeId;
    }

    /**
     * 获取奖项名称
     *
     * @return award_type_name - 奖项名称
     */
    public String getAwardTypeName() {
        return awardTypeName;
    }

    /**
     * 设置奖项名称
     *
     * @param awardTypeName 奖项名称
     */
    public void setAwardTypeName(String awardTypeName) {
        this.awardTypeName = awardTypeName;
    }

    /**
     * @return first_prize_id
     */
    public Integer getFirstPrizeId() {
        return firstPrizeId;
    }

    /**
     * @param firstPrizeId
     */
    public void setFirstPrizeId(Integer firstPrizeId) {
        this.firstPrizeId = firstPrizeId;
    }

    /**
     * @return first_prize_name
     */
    public String getFirstPrizeName() {
        return firstPrizeName;
    }

    /**
     * @param firstPrizeName
     */
    public void setFirstPrizeName(String firstPrizeName) {
        this.firstPrizeName = firstPrizeName;
    }

    /**
     * 获取0初评未通过1初评通过
     *
     * @return first_result - 0初评未通过1初评通过
     */
    public Byte getFirstResult() {
        return firstResult;
    }

    /**
     * 设置0初评未通过1初评通过
     *
     * @param firstResult 0初评未通过1初评通过
     */
    public void setFirstResult(Byte firstResult) {
        this.firstResult = firstResult;
    }

    /**
     * @return final_prize_id
     */
    public Integer getFinalPrizeId() {
        return finalPrizeId;
    }

    /**
     * @param finalPrizeId
     */
    public void setFinalPrizeId(Integer finalPrizeId) {
        this.finalPrizeId = finalPrizeId;
    }

    /**
     * @return final_prize_name
     */
    public String getFinalPrizeName() {
        return finalPrizeName;
    }

    /**
     * @param finalPrizeName
     */
    public void setFinalPrizeName(String finalPrizeName) {
        this.finalPrizeName = finalPrizeName;
    }

    /**
     * @return final_result
     */
    public Byte getFinalResult() {
        return finalResult;
    }

    /**
     * @param finalResult
     */
    public void setFinalResult(Byte finalResult) {
        this.finalResult = finalResult;
    }

    /**
     * 获取0为初评人员管理，1为终评人员管理或是通过初评的人员
     *
     * @return k_type - 0为初评人员管理，1为终评人员管理或是通过初评的人员
     */
    public Short getkType() {
        return kType;
    }

    /**
     * 设置0为初评人员管理，1为终评人员管理或是通过初评的人员
     *
     * @param kType 0为初评人员管理，1为终评人员管理或是通过初评的人员
     */
    public void setkType(Short kType) {
        this.kType = kType;
    }

    /**
     * 获取性别
     *
     * @return k_sex - 性别
     */
    public String getkSex() {
        return kSex;
    }

    /**
     * 设置性别
     *
     * @param kSex 性别
     */
    public void setkSex(String kSex) {
        this.kSex = kSex;
    }

    /**
     * 获取年龄
     *
     * @return k_age - 年龄
     */
    public Integer getkAge() {
        return kAge;
    }

    /**
     * 设置年龄
     *
     * @param kAge 年龄
     */
    public void setkAge(Integer kAge) {
        this.kAge = kAge;
    }

    /**
     * 获取单位
     *
     * @return k_dept - 单位
     */
    public String getkDept() {
        return kDept;
    }

    /**
     * 设置单位
     *
     * @param kDept 单位
     */
    public void setkDept(String kDept) {
        this.kDept = kDept;
    }

    /**
     * 获取学历
     *
     * @return k_education - 学历
     */
    public String getkEducation() {
        return kEducation;
    }

    /**
     * 设置学历
     *
     * @param kEducation 学历
     */
    public void setkEducation(String kEducation) {
        this.kEducation = kEducation;
    }

    /**
     * 获取职称
     *
     * @return k_title - 职称
     */
    public String getkTitle() {
        return kTitle;
    }

    /**
     * 设置职称
     *
     * @param kTitle 职称
     */
    public void setkTitle(String kTitle) {
        this.kTitle = kTitle;
    }

    /**
     * 获取职务
     *
     * @return k_duties - 职务
     */
    public String getkDuties() {
        return kDuties;
    }

    /**
     * 设置职务
     *
     * @param kDuties 职务
     */
    public void setkDuties(String kDuties) {
        this.kDuties = kDuties;
    }

    /**
     * 获取获奖情况_国家级_数量
     *
     * @return k_winning_country_number - 获奖情况_国家级_数量
     */
    public Integer getkWinningCountryNumber() {
        return kWinningCountryNumber;
    }

    /**
     * 设置获奖情况_国家级_数量
     *
     * @param kWinningCountryNumber 获奖情况_国家级_数量
     */
    public void setkWinningCountryNumber(Integer kWinningCountryNumber) {
        this.kWinningCountryNumber = kWinningCountryNumber;
    }

    /**
     * 获取获奖情况_国家级_级别
     *
     * @return k_winning_country_level - 获奖情况_国家级_级别
     */
    public String getkWinningCountryLevel() {
        return kWinningCountryLevel;
    }

    /**
     * 设置获奖情况_国家级_级别
     *
     * @param kWinningCountryLevel 获奖情况_国家级_级别
     */
    public void setkWinningCountryLevel(String kWinningCountryLevel) {
        this.kWinningCountryLevel = kWinningCountryLevel;
    }

    /**
     * 获取获奖情况_国家级_排名前三数量
     *
     * @return k_winning_country_ranking - 获奖情况_国家级_排名前三数量
     */
    public Integer getkWinningCountryRanking() {
        return kWinningCountryRanking;
    }

    /**
     * 设置获奖情况_国家级_排名前三数量
     *
     * @param kWinningCountryRanking 获奖情况_国家级_排名前三数量
     */
    public void setkWinningCountryRanking(Integer kWinningCountryRanking) {
        this.kWinningCountryRanking = kWinningCountryRanking;
    }

    /**
     * 获取获奖情况_省部级_数量
     *
     * @return k_winning_province_number - 获奖情况_省部级_数量
     */
    public Integer getkWinningProvinceNumber() {
        return kWinningProvinceNumber;
    }

    /**
     * 设置获奖情况_省部级_数量
     *
     * @param kWinningProvinceNumber 获奖情况_省部级_数量
     */
    public void setkWinningProvinceNumber(Integer kWinningProvinceNumber) {
        this.kWinningProvinceNumber = kWinningProvinceNumber;
    }

    /**
     * 获取获奖情况_省部级_级别
     *
     * @return k_winning_province_level - 获奖情况_省部级_级别
     */
    public String getkWinningProvinceLevel() {
        return kWinningProvinceLevel;
    }

    /**
     * 设置获奖情况_省部级_级别
     *
     * @param kWinningProvinceLevel 获奖情况_省部级_级别
     */
    public void setkWinningProvinceLevel(String kWinningProvinceLevel) {
        this.kWinningProvinceLevel = kWinningProvinceLevel;
    }

    /**
     * 获取获奖情况_省部级前三数量
     *
     * @return k_winning_province_ranking - 获奖情况_省部级前三数量
     */
    public Integer getkWinningProvinceRanking() {
        return kWinningProvinceRanking;
    }

    /**
     * 设置获奖情况_省部级前三数量
     *
     * @param kWinningProvinceRanking 获奖情况_省部级前三数量
     */
    public void setkWinningProvinceRanking(Integer kWinningProvinceRanking) {
        this.kWinningProvinceRanking = kWinningProvinceRanking;
    }

    /**
     * 获取获奖情况_局级_数量
     *
     * @return k_winning_bureau_number - 获奖情况_局级_数量
     */
    public Integer getkWinningBureauNumber() {
        return kWinningBureauNumber;
    }

    /**
     * 设置获奖情况_局级_数量
     *
     * @param kWinningBureauNumber 获奖情况_局级_数量
     */
    public void setkWinningBureauNumber(Integer kWinningBureauNumber) {
        this.kWinningBureauNumber = kWinningBureauNumber;
    }

    /**
     * 获取获奖情况_局级_级别
     *
     * @return k_winning_bureau_level - 获奖情况_局级_级别
     */
    public String getkWinningBureauLevel() {
        return kWinningBureauLevel;
    }

    /**
     * 设置获奖情况_局级_级别
     *
     * @param kWinningBureauLevel 获奖情况_局级_级别
     */
    public void setkWinningBureauLevel(String kWinningBureauLevel) {
        this.kWinningBureauLevel = kWinningBureauLevel;
    }

    /**
     * 获取获奖情况_局级_排名
     *
     * @return k_winning_bureau_ranking - 获奖情况_局级_排名
     */
    public Integer getkWinningBureauRanking() {
        return kWinningBureauRanking;
    }

    /**
     * 设置获奖情况_局级_排名
     *
     * @param kWinningBureauRanking 获奖情况_局级_排名
     */
    public void setkWinningBureauRanking(Integer kWinningBureauRanking) {
        this.kWinningBureauRanking = kWinningBureauRanking;
    }

    /**
     * 获取行业学会、协会及其他
     *
     * @return k_association - 行业学会、协会及其他
     */
    public Integer getkAssociation() {
        return kAssociation;
    }

    /**
     * 设置行业学会、协会及其他
     *
     * @param kAssociation 行业学会、协会及其他
     */
    public void setkAssociation(Integer kAssociation) {
        this.kAssociation = kAssociation;
    }

    /**
     * 获取专利情况_发明_数量
     *
     * @return k_patent_invention_number - 专利情况_发明_数量
     */
    public Integer getkPatentInventionNumber() {
        return kPatentInventionNumber;
    }

    /**
     * 设置专利情况_发明_数量
     *
     * @param kPatentInventionNumber 专利情况_发明_数量
     */
    public void setkPatentInventionNumber(Integer kPatentInventionNumber) {
        this.kPatentInventionNumber = kPatentInventionNumber;
    }

    /**
     * 获取专利情况_发明_级别
     *
     * @return k_patent_invention_level - 专利情况_发明_级别
     */
    public String getkPatentInventionLevel() {
        return kPatentInventionLevel;
    }

    /**
     * 设置专利情况_发明_级别
     *
     * @param kPatentInventionLevel 专利情况_发明_级别
     */
    public void setkPatentInventionLevel(String kPatentInventionLevel) {
        this.kPatentInventionLevel = kPatentInventionLevel;
    }

    /**
     * 获取专利情况_发明_排名前三数量
     *
     * @return k_patent_invention_ranking - 专利情况_发明_排名前三数量
     */
    public Integer getkPatentInventionRanking() {
        return kPatentInventionRanking;
    }

    /**
     * 设置专利情况_发明_排名前三数量
     *
     * @param kPatentInventionRanking 专利情况_发明_排名前三数量
     */
    public void setkPatentInventionRanking(Integer kPatentInventionRanking) {
        this.kPatentInventionRanking = kPatentInventionRanking;
    }

    /**
     * 获取专利情况_实用新型_数量
     *
     * @return k_patent_practical_number - 专利情况_实用新型_数量
     */
    public Integer getkPatentPracticalNumber() {
        return kPatentPracticalNumber;
    }

    /**
     * 设置专利情况_实用新型_数量
     *
     * @param kPatentPracticalNumber 专利情况_实用新型_数量
     */
    public void setkPatentPracticalNumber(Integer kPatentPracticalNumber) {
        this.kPatentPracticalNumber = kPatentPracticalNumber;
    }

    /**
     * 获取专利情况_实用新型_级别
     *
     * @return k_patent_practical_level - 专利情况_实用新型_级别
     */
    public String getkPatentPracticalLevel() {
        return kPatentPracticalLevel;
    }

    /**
     * 设置专利情况_实用新型_级别
     *
     * @param kPatentPracticalLevel 专利情况_实用新型_级别
     */
    public void setkPatentPracticalLevel(String kPatentPracticalLevel) {
        this.kPatentPracticalLevel = kPatentPracticalLevel;
    }

    /**
     * 获取专利情况_实用新型_排名
     *
     * @return k_patent_practical_ranking - 专利情况_实用新型_排名
     */
    public Integer getkPatentPracticalRanking() {
        return kPatentPracticalRanking;
    }

    /**
     * 设置专利情况_实用新型_排名
     *
     * @param kPatentPracticalRanking 专利情况_实用新型_排名
     */
    public void setkPatentPracticalRanking(Integer kPatentPracticalRanking) {
        this.kPatentPracticalRanking = kPatentPracticalRanking;
    }

    /**
     * 获取版权软件专利数量
     *
     * @return k_copyright_number - 版权软件专利数量
     */
    public Integer getkCopyrightNumber() {
        return kCopyrightNumber;
    }

    /**
     * 设置版权软件专利数量
     *
     * @param kCopyrightNumber 版权软件专利数量
     */
    public void setkCopyrightNumber(Integer kCopyrightNumber) {
        this.kCopyrightNumber = kCopyrightNumber;
    }

    /**
     * 获取论文著作_SCI
     *
     * @return k_sci - 论文著作_SCI
     */
    public Integer getkSci() {
        return kSci;
    }

    /**
     * 设置论文著作_SCI
     *
     * @param kSci 论文著作_SCI
     */
    public void setkSci(Integer kSci) {
        this.kSci = kSci;
    }

    /**
     * 获取论文著作_EI
     *
     * @return k_ei - 论文著作_EI
     */
    public Integer getkEi() {
        return kEi;
    }

    /**
     * 设置论文著作_EI
     *
     * @param kEi 论文著作_EI
     */
    public void setkEi(Integer kEi) {
        this.kEi = kEi;
    }

    /**
     * 获取核心期刊
     *
     * @return k_kernel - 核心期刊
     */
    public Integer getkKernel() {
        return kKernel;
    }

    /**
     * 设置核心期刊
     *
     * @param kKernel 核心期刊
     */
    public void setkKernel(Integer kKernel) {
        this.kKernel = kKernel;
    }

    /**
     * 获取著作
     *
     * @return k_work - 著作
     */
    public Integer getkWork() {
        return kWork;
    }

    /**
     * 设置著作
     *
     * @param kWork 著作
     */
    public void setkWork(Integer kWork) {
        this.kWork = kWork;
    }

    /**
     * 获取项目名称
     *
     * @return k_projectname - 项目名称
     */
    public String getkProjectname() {
        return kProjectname;
    }

    /**
     * 设置项目名称
     *
     * @param kProjectname 项目名称
     */
    public void setkProjectname(String kProjectname) {
        this.kProjectname = kProjectname;
    }

    /**
     * 获取负担职责
     *
     * @return k_responsibility - 负担职责
     */
    public String getkResponsibility() {
        return kResponsibility;
    }

    /**
     * 设置负担职责
     *
     * @param kResponsibility 负担职责
     */
    public void setkResponsibility(String kResponsibility) {
        this.kResponsibility = kResponsibility;
    }

    /**
     * 获取人员信息
     *
     * @return person_info - 人员信息
     */
    public String getPersonInfo() {
        return personInfo;
    }

    /**
     * 设置人员信息
     *
     * @param personInfo 人员信息
     */
    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

    /**
     * 获取备注
     *
     * @return k_remarks - 备注
     */
    public String getkRemarks() {
        return kRemarks;
    }

    /**
     * 设置备注
     *
     * @param kRemarks 备注
     */
    public void setkRemarks(String kRemarks) {
        this.kRemarks = kRemarks;
    }
}