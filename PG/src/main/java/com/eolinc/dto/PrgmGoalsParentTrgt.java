package com.eolinc.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prgm_goals_parent_trgt")
public class PrgmGoalsParentTrgt extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long parentTrgtId = 1L;
	private Long respondentId;
	private BigDecimal gradePctgTrgt;
	private BigDecimal gradePctgLastYr;
	private BigDecimal gradePctgAvg;
	private String college;
	private Byte collegeYr;
	private Long collegeTypeId;
	private Date respondentDt;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id @Column(name="PARENT_TRGT_ID")
	public Long getPrgmGoalsParentTrgtId() {
		return id;
	}
	public void setPrgmGoalsParentTrgtId(Long id) {
		this.id = id;
	}
	@Column(name="RESPONDENT_ID")
	public Long getRespondentId() {
		return respondentId;
	}
	public void setRespondentId(Long respondentId) {
		this.respondentId = respondentId;
	}
	public Long getParentTrgtId() {
		return parentTrgtId;
	}
	public void setParentTrgtId(Long parentTrgtId) {
		this.parentTrgtId = parentTrgtId;
	}
	@Column(name="GRADE_PCTG_TRGT")
	public BigDecimal getGradePctgTrgt() {
		return gradePctgTrgt;
	}
	public void setGradePctgTrgt(BigDecimal gradePctgTrgt) {
		this.gradePctgTrgt = gradePctgTrgt;
	}
	@Column(name="GRADE_PCTG_LAST_YR")
	public BigDecimal getGradePctgLastYr() {
		return gradePctgLastYr;
	}
	public void setGradePctgLastYr(BigDecimal gradePctgLastYr) {
		this.gradePctgLastYr = gradePctgLastYr;
	}
	@Column(name="GRADE_PCTG_AVG")
	public BigDecimal getGradePctgAvg() {
		return gradePctgAvg;
	}
	public void setGradePctgAvg(BigDecimal gradePctgAvg) {
		this.gradePctgAvg = gradePctgAvg;
	}
	@Column(name="COLLEGE")
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Column(name="COLLEGE_YR")
	public Byte getCollegeYr() {
		return collegeYr;
	}
	public void setCollegeYr(Byte collegeYr) {
		this.collegeYr = collegeYr;
	}
	@Column(name="COLLEGE_TYPE_ID")
	public Long getCollegeTypeId() {
		return collegeTypeId;
	}
	public void setCollegeTypeId(Long collegeTypeId) {
		this.collegeTypeId = collegeTypeId;
	}
	@Column(name="RESPONDENT_DT")
	public Date getRespondentDt() {
		return respondentDt;
	}
	public void setRespondentDt(Date respondentDt) {
		this.respondentDt = respondentDt;
	}
	@Override
	public String toString() {
		return "PrgmGoalsParentTrgt [college=" + college + ", collegeTypeId="
				+ collegeTypeId + ", collegeYr=" + collegeYr
				+ ", gradePctgAvg=" + gradePctgAvg + ", gradePctgLastYr="
				+ gradePctgLastYr + ", gradePctgTrgt=" + gradePctgTrgt
				+ ", parentTrgtId=" + parentTrgtId + ", respondentDt="
				+ respondentDt + ", respondentId=" + respondentId + "]";
	}
}
