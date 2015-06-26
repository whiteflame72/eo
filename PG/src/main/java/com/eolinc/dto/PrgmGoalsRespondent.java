package com.eolinc.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="prgm_goals_respondent")
public class PrgmGoalsRespondent extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Date respondentDt;
	private String respondentType;
	private Long studentId;
	private Long teacherId;
	private Long subjectId;
	private BigDecimal studentRank;
	private BigDecimal gradePctg;
	private Date addedDt = new Date();
	private String addedBy;
	private Date updtDt = new Date();
	private String updtBy;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id @Column(name="RESPONDENT_ID")
	public Long getPrgmGoalsRespondentId() {
		return id;
	}
	public void setPrgmGoalsRespondentId(Long id) {
		this.id = id;
	}
	@Column(name="RESPONDENT_DT")
	public Date getRespondentDt() {
		return respondentDt;
	}
	public void setRespondentDt(Date respondentDt) {
		this.respondentDt = respondentDt;
	}
	@Column(name="RESPONDENT_TYPE")
	public String getRespondentType() {
		return respondentType;
	}
	public void setRespondentType(String respondentType) {
		this.respondentType = respondentType;
	}
	@Column(name="STUDENT_ID")
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	@Column(name="TEACHER_ID")
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	@Column(name="SUBJECT_ID")
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	@Column(name="GRADE_PCTG")
	public BigDecimal getGradePctg() {
		return gradePctg;
	}
	public void setGradePctg(BigDecimal gradePctg) {
		this.gradePctg = gradePctg;
	}
	@Column(name="ADDED_DT")
	public Date getAddedDt() {
		return addedDt;
	}
	@Column(name="ADDED_DT")
	public void setAddedDt(Date addedDt) {
		this.addedDt = addedDt;
	}
	@Column(name="ADDED_BY")
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	@Column(name="UPDT_DT")
	public Date getUpdtDt() {
		return updtDt;
	}
	public void setUpdtDt(Date updtDt) {
		this.updtDt = updtDt;
	}
	@Column(name="UPDT_BY")
	public String getUpdtBy() {
		return updtBy;
	}
	public void setUpdtBy(String updtBy) {
		this.updtBy = updtBy;
	}
	
	@Column(name="STUDENT_RANK")
	public BigDecimal getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(BigDecimal studentRank) {
		this.studentRank = studentRank;
	}
	@Override
	public String toString() {
		return "PrgmGoalsRespondent [addedBy=" + addedBy + ", addedDt="
				+ addedDt + ", gradePctg=" + gradePctg + ", respondentDt="
				+ respondentDt + ", respondentType=" + respondentType
				+ ", studentId=" + studentId + ", studentRank=" + studentRank
				+ ", subjectId=" + subjectId + ", teacherId=" + teacherId
				+ ", updtBy=" + updtBy + ", updtDt=" + updtDt + "]";
	}
}
