package com.eolinc.dto;

import java.util.Date;

public class StudentResults extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long activityId;
	private char activityType;
	private Long problemId;
	private Date startTm;
	private Date endTm;
	private String prblmResult;
	private Long studentId;
	private Long subjectId;
	private String addedBy;
	private Date addedDt = new Date();
	private String updtBy;
	private Date updtDt = new Date();
	
	public Long getStudentResultsId() {
		return id;
	}
	public void setStudentResultsId(Long id) {
		this.id = id;
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
	public Long getProblemId() {
		return problemId;
	}
	public void setProblemId(Long problemId) {
		this.problemId = problemId;
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
	public String getPrblmResult() {
		return prblmResult;
	}
	public void setPrblmResult(String prblmResult) {
		this.prblmResult = prblmResult;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public Date getUpdtDt() {
		return updtDt;
	}
	public void setUpdtDt(Date updtDt) {
		this.updtDt = updtDt;
	}
	public String getUpdtBy() {
		return updtBy;
	}
	public void setUpdtBy(String updtBy) {
		this.updtBy = updtBy;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Date getAddedDt() {
		return addedDt;
	}
	public void setAddedDt(Date addedDt) {
		this.addedDt = addedDt;
	}
	@Override
	public String toString() {
		return "StudentResults [activityId=" + activityId + ", activityType="
				+ activityType + ", addedBy=" + addedBy + ", addedDt="
				+ addedDt + ", endTm=" + endTm + ", prblmResult=" + prblmResult
				+ ", problemId=" + problemId + ", startTm=" + startTm
				+ ", studentId=" + studentId + ", subjectId=" + subjectId
				+ ", updtBy=" + updtBy + ", updtDt=" + updtDt + "]";
	}

}
