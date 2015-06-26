package com.eolinc.dto;

import java.util.Date;

public class StudentTeacherPair extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long studentId;
	private Long teacherId;
	private Long subjectId;
	private Date addedDt = new Date();
	private String addedBy;
	private Date updtDt = new Date();
	private String updtBy;
	
	public Long getStudentTeacherPairId() {
		return id;
	}
	public void setStudentTeacherPairId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
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
	@Override
	public String toString() {
		return "StudentTeacherPair [addedBy=" + addedBy + ", addedDt="
				+ addedDt + ", studentId=" + studentId + ", subjectId="
				+ subjectId + ", teacherId=" + teacherId + ", updtBy=" + updtBy
				+ ", updtDt=" + updtDt + "]";
	}

}
