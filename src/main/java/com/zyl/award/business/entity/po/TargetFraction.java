package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "target_fraction")
public class TargetFraction extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "award_year")
    private Integer awardYear;

    @Column(name = "round_id")
    private Integer roundId;

    @Column(name = "round_index")
    private Short roundIndex;

    @Column(name = "meeting_id")
    private Integer meetingId;

    @Column(name = "meeting_name")
    private String meetingName;

    @Column(name = "expert_id")
    private Integer expertId;

    @Column(name = "expert_code")
    private String expertCode;

    @Column(name = "expert_name")
    private String expertName;

    @Column(name = "award_id")
    private Short awardId;

    /**
     * 0-> 人员  1-> 项目
     */
    @Column(name = "award_type_type")
    private Short awardTypeType;

    /**
     * 人员或项目的id
     */
    @Column(name = "obj_id")
    private Integer objId;

    @Column(name = "obj_name")
    private String objName;

    @Column(name = "target_id")
    private Integer targetId;

    @Column(name = "target_name")
    private String targetName;

    @Column(name = "target_score")
    private BigDecimal targetScore;

    /**
     * 是否已经提交
     */
    @Column(name = "submit")
    private Byte submit;

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
     * @return award_year
     */
    public Integer getAwardYear() {
        return awardYear;
    }

    /**
     * @param awardYear
     */
    public void setAwardYear(Integer awardYear) {
        this.awardYear = awardYear;
    }

    /**
     * @return round_id
     */
    public Integer getRoundId() {
        return roundId;
    }

    /**
     * @param roundId
     */
    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    /**
     * @return round_index
     */
    public Short getRoundIndex() {
        return roundIndex;
    }

    /**
     * @param roundIndex
     */
    public void setRoundIndex(Short roundIndex) {
        this.roundIndex = roundIndex;
    }

    /**
     * @return meeting_id
     */
    public Integer getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId
     */
    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * @return meeting_name
     */
    public String getMeetingName() {
        return meetingName;
    }

    /**
     * @param meetingName
     */
    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    /**
     * @return expert_id
     */
    public Integer getExpertId() {
        return expertId;
    }

    /**
     * @param expertId
     */
    public void setExpertId(Integer expertId) {
        this.expertId = expertId;
    }

    /**
     * @return expert_code
     */
    public String getExpertCode() {
        return expertCode;
    }

    /**
     * @param expertCode
     */
    public void setExpertCode(String expertCode) {
        this.expertCode = expertCode;
    }

    /**
     * @return expert_name
     */
    public String getExpertName() {
        return expertName;
    }

    /**
     * @param expertName
     */
    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    /**
     * @return award_id
     */
    public Short getAwardId() {
        return awardId;
    }

    /**
     * @param awardId
     */
    public void setAwardId(Short awardId) {
        this.awardId = awardId;
    }

    /**
     * 获取0-> 人员  1-> 项目
     *
     * @return award_type_type - 0-> 人员  1-> 项目
     */
    public Short getAwardTypeType() {
        return awardTypeType;
    }

    /**
     * 设置0-> 人员  1-> 项目
     *
     * @param awardTypeType 0-> 人员  1-> 项目
     */
    public void setAwardTypeType(Short awardTypeType) {
        this.awardTypeType = awardTypeType;
    }

    /**
     * 获取人员或项目的id
     *
     * @return obj_id - 人员或项目的id
     */
    public Integer getObjId() {
        return objId;
    }

    /**
     * 设置人员或项目的id
     *
     * @param objId 人员或项目的id
     */
    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    /**
     * @return obj_name
     */
    public String getObjName() {
        return objName;
    }

    /**
     * @param objName
     */
    public void setObjName(String objName) {
        this.objName = objName;
    }

    /**
     * @return target_id
     */
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * @param targetId
     */
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /**
     * @return target_name
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * @param targetName
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * @return target_score
     */
    public BigDecimal getTargetScore() {
        return targetScore;
    }

    /**
     * @param targetScore
     */
    public void setTargetScore(BigDecimal targetScore) {
        this.targetScore = targetScore;
    }

    /**
     * 获取是否已经提交
     *
     * @return submit - 是否已经提交
     */
    public Byte getSubmit() {
        return submit;
    }

    /**
     * 设置是否已经提交
     *
     * @param submit 是否已经提交
     */
    public void setSubmit(Byte submit) {
        this.submit = submit;
    }
}