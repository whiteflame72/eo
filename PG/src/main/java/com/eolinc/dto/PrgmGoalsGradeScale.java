package com.eolinc.dto;

import java.math.BigDecimal;

public class PrgmGoalsGradeScale extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long respondentId;
//	private GradeScale gradeScaleId;
	private String gradeScaleId;
	private BigDecimal gradeUpperBnd;
	private BigDecimal gradeLowerBnd;
	
	public Long getPrgmGoalsGradeScaleId() {
		return id;
	}
	public void setPrgmGoalsGradeScaleId(Long id) {
		this.id = id;
	}
	public Long getRespondentId() {
		return respondentId;
	}
	public void setRespondentId(Long respondentId) {
		this.respondentId = respondentId;
	}

	public String getGradeScaleId() {
		return gradeScaleId;
	}
	public void setGradeScaleId(String gradeScaleId) {
		this.gradeScaleId = gradeScaleId;
	}
/*	public GradeScale getGradeScaleId() {
		return gradeScaleId;
	}
	public void setGradeScaleId(GradeScale gradeScaleId) {
		this.gradeScaleId = gradeScaleId;
	}
*/	public BigDecimal getGradeUpperBnd() {
		return gradeUpperBnd;
	}
	public void setGradeUpperBnd(BigDecimal gradeUpperBnd) {
		this.gradeUpperBnd = gradeUpperBnd;
	}
	public BigDecimal getGradeLowerBnd() {
		return gradeLowerBnd;
	}
	public void setGradeLowerBnd(BigDecimal gradeLowerBnd) {
		this.gradeLowerBnd = gradeLowerBnd;
	}
	@Override
	public String toString() {
		return "PrgmGoalsGradeScale [gradeLowerBnd=" + gradeLowerBnd
				+ ", gradeScaleId=" + gradeScaleId + ", gradeUpperBnd="
				+ gradeUpperBnd + ", respondentId=" + respondentId + "]";
	}
}
