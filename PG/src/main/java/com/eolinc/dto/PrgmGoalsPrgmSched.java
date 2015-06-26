package com.eolinc.dto;

import java.util.Date;

public class PrgmGoalsPrgmSched extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String schedLevel;
	private Date schedEndTm;
	private Long respondentId;
	private Long subjectId;
	private String schedDay;
	private Date schedBgnTm;
	
	public Long getPrgmGoalsPrgmSchedId() {
		return id;
	}
	public void setPrgmGoalsPrgmSchedId(Long id) {
		this.id = id;
	}
	public String getSchedLevel() {
		return schedLevel;
	}
	public void setSchedLevel(String schedLevel) {
		this.schedLevel = schedLevel;
	}
	public Date getSchedEndTm() {
		return schedEndTm;
	}
	public void setSchedEndTm(Date schedEndTm) {
		this.schedEndTm = schedEndTm;
	}
	public Long getRespondentId() {
		return respondentId;
	}
	public void setRespondentId(Long respondentId) {
		this.respondentId = respondentId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSchedDay() {
		return schedDay;
	}
	public void setSchedDay(String schedDay) {
		this.schedDay = schedDay;
	}
	public Date getSchedBgnTm() {
		return schedBgnTm;
	}
	public void setSchedBgnTm(Date schedBgnTm) {
		this.schedBgnTm = schedBgnTm;
	}
	@Override
	public String toString() {
		return "PrgmGoalsPrgmSched [respondentId=" + respondentId
				+ ", schedBgnTm=" + schedBgnTm + ", schedDay=" + schedDay
				+ ", schedEndTm=" + schedEndTm + ", schedLevel=" + schedLevel
				+ ", subjectId=" + subjectId + "]";
	}
}
