package com.eolinc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String teacherFirstname;
	private String teacherLastname;
	private String teacherTitle;
	private String teacherEmail;
	private String teacherAddr1;
	private String teacherAddr2;
	private String teacherAddr3;
	private String teacherCity;
	private String teacherState;
	private String teacherZip;
	private String teacherCountry;
	private String teacherAttn;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id @Column(name="TEACHER_ID")
	public Long getTeacherId() {
		return id;
	}
	public void setTeacherId(Long id) {
		this.id = id;
	}
	@Column(name="TEACHER_FIRST_NAME")	
	public String getTeacherFirstname() {
		return teacherFirstname;
	}
	public void setTeacherFirstname(String teacherFirstname) {
		this.teacherFirstname = teacherFirstname;
	}
	@Column(name="TEACHER_LAST_NAME")	
	public String getTeacherLastname() {
		return teacherLastname;
	}
	public void setTeacherLastname(String teacherLastname) {
		this.teacherLastname = teacherLastname;
	}
	@Column(name="TEACHER_TITLE")	
	public String getTeacherTitle() {
		return teacherTitle;
	}
	public void setTeacherTitle(String teacherTitle) {
		this.teacherTitle = teacherTitle;
	}
	@Column(name="TEACHER_EMAIL")	
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	@Column(name="TEACHER_ADDR1")	
	public String getTeacherAddr1() {
		return teacherAddr1;
	}
	public void setTeacherAddr1(String teacherAddr1) {
		this.teacherAddr1 = teacherAddr1;
	}
	@Column(name="TEACHER_ADDR2")	
	public String getTeacherAddr2() {
		return teacherAddr2;
	}
	public void setTeacherAddr2(String teacherAddr2) {
		this.teacherAddr2 = teacherAddr2;
	}
	@Column(name="TEACHER_ADDR3")	
	public String getTeacherAddr3() {
		return teacherAddr3;
	}
	public void setTeacherAddr3(String teacherAddr3) {
		this.teacherAddr3 = teacherAddr3;
	}
	@Column(name="TEACHER_CITY")
	public String getTeacherCity() {
		return teacherCity;
	}
	public void setTeacherCity(String teacherCity) {
		this.teacherCity = teacherCity;
	}
	@Column(name="TEACHER_STATE")
	public String getTeacherState() {
		return teacherState;
	}
	public void setTeacherState(String teacherState) {
		this.teacherState = teacherState;
	}
	@Column(name="TEACHER_ZIP")
	public String getTeacherZip() {
		return teacherZip;
	}
	public void setTeacherZip(String teacherZip) {
		this.teacherZip = teacherZip;
	}
	@Column(name="TEACHER_COUNTRY")
	public String getTeacherCountry() {
		return teacherCountry;
	}
	public void setTeacherCountry(String teacherCountry) {
		this.teacherCountry = teacherCountry;
	}
	@Column(name="TEACHER_ATTN")
	public String getTeacherAttn() {
		return teacherAttn;
	}
	public void setTeacherAttn(String teacherAttn) {
		this.teacherAttn = teacherAttn;
	}
	@Override
	public String toString() {
		return "Teacher [teacherAddr1=" + teacherAddr1 + ", teacherAddr2="
				+ teacherAddr2 + ", teacherAddr3=" + teacherAddr3
				+ ", teacherAttn=" + teacherAttn + ", teacherCity="
				+ teacherCity + ", teacherCountry=" + teacherCountry
				+ ", teacherEmail=" + teacherEmail + ", teacherFirstname="
				+ teacherFirstname + ", teacherLastname=" + teacherLastname
				+ ", teacherState=" + teacherState + ", teacherTitle="
				+ teacherTitle + ", teacherZip=" + teacherZip + "]";
	}
	
}