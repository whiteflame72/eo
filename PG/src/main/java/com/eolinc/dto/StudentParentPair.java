package com.eolinc.dto;

import java.util.Date;

public class StudentParentPair extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long studentId;
	private Long parentId;
	private Date addedDt = new Date();
	private String addedBy;
	private Date updtDt = new Date();
	private String updtBy;
	
	public Long getStudentParentPairId() {
		return id;
	}
	public void setStudentParentPairId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
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
		return "StudentParentPair [addedBy=" + addedBy + ", addedDt=" + addedDt
				+ ", parentId=" + parentId + ", studentId=" + studentId
				+ ", updtBy=" + updtBy + ", updtDt=" + updtDt + "]";
	}

}
