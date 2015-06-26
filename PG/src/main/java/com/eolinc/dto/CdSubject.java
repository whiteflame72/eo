package com.eolinc.dto;

public class CdSubject extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String subjectName;

	public Long getCdSubjectId() {
		return id;
	}
	public void setCdSubjectId(Long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "CdSubject [subjectName=" + subjectName + "]";
	}
}
