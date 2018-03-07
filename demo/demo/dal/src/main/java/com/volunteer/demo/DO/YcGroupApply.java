package com.volunteer.demo.DO;

import java.io.Serializable;
import java.util.Date;

public class YcGroupApply implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yc_group_apply.apply_id
     *
     * @mbggenerated
     */
    private Long applyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yc_group_apply.apply_user_id
     *
     * @mbggenerated
     */
    private Long applyUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yc_group_apply.apply_group_id
     *
     * @mbggenerated
     */
    private Long applyGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yc_group_apply.apply_time
     *
     * @mbggenerated
     */
    private Date applyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yc_group_apply.apply_status
     *
     * @mbggenerated
     */
    private Integer applyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yc_group_apply
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yc_group_apply.apply_id
     *
     * @return the value of yc_group_apply.apply_id
     *
     * @mbggenerated
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yc_group_apply.apply_id
     *
     * @param applyId the value for yc_group_apply.apply_id
     *
     * @mbggenerated
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yc_group_apply.apply_user_id
     *
     * @return the value of yc_group_apply.apply_user_id
     *
     * @mbggenerated
     */
    public Long getApplyUserId() {
        return applyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yc_group_apply.apply_user_id
     *
     * @param applyUserId the value for yc_group_apply.apply_user_id
     *
     * @mbggenerated
     */
    public void setApplyUserId(Long applyUserId) {
        this.applyUserId = applyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yc_group_apply.apply_group_id
     *
     * @return the value of yc_group_apply.apply_group_id
     *
     * @mbggenerated
     */
    public Long getApplyGroupId() {
        return applyGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yc_group_apply.apply_group_id
     *
     * @param applyGroupId the value for yc_group_apply.apply_group_id
     *
     * @mbggenerated
     */
    public void setApplyGroupId(Long applyGroupId) {
        this.applyGroupId = applyGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yc_group_apply.apply_time
     *
     * @return the value of yc_group_apply.apply_time
     *
     * @mbggenerated
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yc_group_apply.apply_time
     *
     * @param applyTime the value for yc_group_apply.apply_time
     *
     * @mbggenerated
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yc_group_apply.apply_status
     *
     * @return the value of yc_group_apply.apply_status
     *
     * @mbggenerated
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yc_group_apply.apply_status
     *
     * @param applyStatus the value for yc_group_apply.apply_status
     *
     * @mbggenerated
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_group_apply
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", applyUserId=").append(applyUserId);
        sb.append(", applyGroupId=").append(applyGroupId);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyStatus=").append(applyStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}