package com.eolinc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long profileId;
	private Integer grade;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id @Column(name="STUDENT_ID")
	public Long getStudentId() {
		return id;
	}
	public void setStudentId(Long id) {
		this.id = id;
	}
	@Column(name="PROFILE_ID")
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	@Column(name="GRADE")
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", profileId=" + profileId + "]";
	}

}
