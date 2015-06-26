package com.eolinc.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_lrng_style")
public class StudentLearningStyle extends BaseDto {
	private static final long serialVersionUID = 1L;

	private StudentLearningStylePK studentLearningStylePK;
//	private Long studentId;
//	private Long learningStyleId;
	private Long weight;
	private Long subjectId;
	private Date addedDt = new Date();
	private String addedBy;
	private Date updtDt = new Date();
	private String updtBy;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@EmbeddedId
	public StudentLearningStylePK getStudentLearningStylePK() {
		return studentLearningStylePK;
	}
	public void setStudentLearningStylePK(
			StudentLearningStylePK studentLearningStylePK) {
		this.studentLearningStylePK = studentLearningStylePK;
	}
	@Transient
	public Long getStudentLearningStyleId() {
		return id;
	}
	public void setStudentLearningStyleId(Long id) {
		this.id = id;
	}
//	public Long getStudentId() {
//		return studentId;
//	}
//	public void setStudentId(Long studentId) {
//		this.studentId = studentId;
//	}
//	public Long getLearningStyleId() {
//		return learningStyleId;
//	}
//	public void setLearningStyleId(Long learningStyleId) {
//		this.learningStyleId = learningStyleId;
//	}
	@Column(name="WEIGHT")
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	@Column(name="SUBJECT_ID")
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	@Column(name="ADDED_DT")
	public Date getAddedDt() {
		return addedDt;
	}
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
	@Override
	public String toString() {
		return "StudentLearningStyle [addedBy=" + addedBy + ", addedDt=" + addedDt
//				+ ", learningStyleId=" 
//				+ learningStyleId + 
//				", studentId=" + studentId
				+ ", subjectId=" + subjectId + ", updtBy=" + updtBy
				+ ", updtDt=" + updtDt + ", weight=" + weight + "]";
	}

}
