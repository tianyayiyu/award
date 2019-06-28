package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "meeting_round_vote_obj")
public class MeetingRoundVoteObj extends BasePO<Integer> {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "meeting_id")
    private Integer meetingId;

    @Column(name = "meeting_name")
    private String meetingName;

    @Column(name = "award_year")
    private Short awardYear;

    /**
     * 0-人员 1-项目
     */
    @Column(name = "award_type_type")
    private Short awardTypeType;

    @Column(name = "round_id")
    private Integer roundId;

    @Column(name = "round_index")
    private Short roundIndex;

    @Column(name = "expert_id")
    private Integer expertId;

    @Column(name = "expert_code")
    private String expertCode;

    @Column(name = "expert_name")
    private String expertName;

    /**
     * 人员或者项目
     */
    @Column(name = "obj_id")
    private Integer objId;

    @Column(name = "obj_code")
    private String objCode;

    @Column(name = "obj_name")
    private String objName;

    /**
     * 通过不通过弃权 同意不同意弃权
     */
    @Column(name = "vote_prize_id")
    private Integer votePrizeId;

    @Column(name = "vote_prize_name")
    private String votePrizeName;

    /**
     * 综合分数
     */
    @Column(name = "vote_award_score")
    private BigDecimal voteAwardScore;

    /**
     * 是否提交 0 -否 1- 是
     */
    @Column(name = "commit")
    private Byte commit;

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
     * 获取0-人员 1-项目
     *
     * @return award_type_type - 0-人员 1-项目
     */
    public Short getAwardTypeType() {
        return awardTypeType;
    }

    /**
     * 设置0-人员 1-项目
     *
     * @param awardTypeType 0-人员 1-项目
     */
    public void setAwardTypeType(Short awardTypeType) {
        this.awardTypeType = awardTypeType;
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
     * 获取人员或者项目
     *
     * @return obj_id - 人员或者项目
     */
    public Integer getObjId() {
        return objId;
    }

    /**
     * 设置人员或者项目
     *
     * @param objId 人员或者项目
     */
    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    /**
     * @return obj_code
     */
    public String getObjCode() {
        return objCode;
    }

    /**
     * @param objCode
     */
    public void setObjCode(String objCode) {
        this.objCode = objCode;
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
     * 获取通过不通过弃权 同意不同意弃权
     *
     * @return vote_prize_id - 通过不通过弃权 同意不同意弃权
     */
    public Integer getVotePrizeId() {
        return votePrizeId;
    }

    /**
     * 设置通过不通过弃权 同意不同意弃权
     *
     * @param votePrizeId 通过不通过弃权 同意不同意弃权
     */
    public void setVotePrizeId(Integer votePrizeId) {
        this.votePrizeId = votePrizeId;
    }

    /**
     * @return vote_prize_name
     */
    public String getVotePrizeName() {
        return votePrizeName;
    }

    /**
     * @param votePrizeName
     */
    public void setVotePrizeName(String votePrizeName) {
        this.votePrizeName = votePrizeName;
    }

    /**
     * 获取综合分数
     *
     * @return vote_award_score - 综合分数
     */
    public BigDecimal getVoteAwardScore() {
        return voteAwardScore;
    }

    /**
     * 设置综合分数
     *
     * @param voteAwardScore 综合分数
     */
    public void setVoteAwardScore(BigDecimal voteAwardScore) {
        this.voteAwardScore = voteAwardScore;
    }

    /**
     * 获取是否提交 0 -否 1- 是
     *
     * @return commit - 是否提交 0 -否 1- 是
     */
    public Byte getCommit() {
        return commit;
    }

    /**
     * 设置是否提交 0 -否 1- 是
     *
     * @param commit 是否提交 0 -否 1- 是
     */
    public void setCommit(Byte commit) {
        this.commit = commit;
    }
}