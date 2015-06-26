package com.eolinc.dto;

import java.util.Date;

public class StudentActivityLog extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long studentId;
	private Date startTm;
	private Date endTm;
	private Long activityId;
	private char activityType;
	private Long subjectId;
	private Long topicId;
	private Long lrnObjId;
	private Long sessionId;
	private String prblmDesc;
	private String answrDesc;
	private String indicator;
	private Long otherId;
	private String prblmResult;
	private Date addedDt = new Date();
	private String addedBy;
	
	public Long getStudentActivityLogId() {
		return id;
	}
	public void setStudentActivityLogId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Date getStartTm() {
		return startTm;
	}
	public void setStartTm(Date startTm) {
		this.startTm = startTm;
	}
	public Date getEndTm() {
		return endTm;
	}
	public void setEndTm(Date endTm) {
		this.endTm = endTm;
	}
	public Long getActivityId() {
		return activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public char getActivityType() {
		return activityType;
	}
	public void setActivityType(char activityType) {
		this.activityType = activityType;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	public Long getLrnObjId() {
		return lrnObjId;
	}
	public void setLrnObjId(Long lrnObjId) {
		this.lrnObjId = lrnObjId;
	}
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public String getPrblmDesc() {
		return prblmDesc;
	}
	public void setPrblmDesc(String prblmDesc) {
		this.prblmDesc = prblmDesc;
	}
	public String getAnswrDesc() {
		return answrDesc;
	}
	public void setAnswrDesc(String answrDesc) {
		this.answrDesc = answrDesc;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	public Long getOtherId() {
		return otherId;
	}
	public void setOtherId(Long otherId) {
		this.otherId = otherId;
	}
	public String getPrblmResult() {
		return prblmResult;
	}
	public void setPrblmResult(String prblmResult) {
		this.prblmResult = prblmResult;
	}
	public Date getAddedDt() {
		return addedDt;
	}
	public void setAddedDt(Date addedDt) {
		this.addedDt = addedDt;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	@Override
	public String toString() {
		return "StudentActivityLog [activityId=" + activityId
				+ ", activityType=" + activityType + ", addedBy=" + addedBy
				+ ", addedDt=" + addedDt + ", answrDesc=" + answrDesc
				+ ", endTm=" + endTm + ", indicator=" + indicator
				+ ", lrnObjId=" + lrnObjId + ", otherId=" + otherId
				+ ", prblmDesc=" + prblmDesc + ", prblmResult=" + prblmResult
				+ ", sessionId=" + sessionId + ", startTm=" + startTm
				+ ", studentId=" + studentId + ", subjectId=" + subjectId
				+ ", topicId=" + topicId + "]";
	}
}
