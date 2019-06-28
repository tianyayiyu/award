package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "award_expert")
public class AwardExpert extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

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

    @Column(name = "award_year")
    private Short awardYear;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "vote_status_id")
    private Short voteStatusId;

    @Column(name = "vote_status_name")
    private String voteStatusName;

    @Column(name = "order")
    private Short order;

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
     * @return award_year
     */
    public Short getAwardYear() {
        return awardYear;
    }

    /**
     * @param awardYear
     */
    public void setAwardYear(Short awardYear) {
        this.awardYear = awardYear;
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return vote_status_id
     */
    public Short getVoteStatusId() {
        return voteStatusId;
    }

    /**
     * @param voteStatusId
     */
    public void setVoteStatusId(Short voteStatusId) {
        this.voteStatusId = voteStatusId;
    }

    /**
     * @return vote_status_name
     */
    public String getVoteStatusName() {
        return voteStatusName;
    }

    /**
     * @param voteStatusName
     */
    public void setVoteStatusName(String voteStatusName) {
        this.voteStatusName = voteStatusName;
    }

    /**
     * @return order
     */
    public Short getOrder() {
        return order;
    }

    /**
     * @param order
     */
    public void setOrder(Short order) {
        this.order = order;
    }
}