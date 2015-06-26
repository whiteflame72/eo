package com.eolinc.dto;

import java.util.Date;

public class PrgmGoalsRegistration extends BaseDto {
	private static final long serialVersionUID = 1L;

    private String parentName;
    private String studentName;
    private String parentAddress1;
    private String parentAddress2;
    private String studentAddress1;
    private String studentAddress2;
    private String parentCountry;
    private String studentCountry;
    private String parentZip;
    private String studentZip;
    private String parentPhone;
    private String studentPhone;
    private String password;
    private Date addedDt = new Date();
    private String addedBy;
    private Date updtDt = new Date();
    private String updtBy;
    
	public Long getPrgmGoalsRegistrationId() {
		return id;
	}
	public void setPrgmGoalsRegistrationId(Long id) {
		this.id = id;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getParentAddress1() {
		return parentAddress1;
	}
	public void setParentAddress1(String parentAddress1) {
		this.parentAddress1 = parentAddress1;
	}
	public String getParentAddress2() {
		return parentAddress2;
	}
	public void setParentAddress2(String parentAddress2) {
		this.parentAddress2 = parentAddress2;
	}
	public String getStudentAddress1() {
		return studentAddress1;
	}
	public void setStudentAddress1(String studentAddress1) {
		this.studentAddress1 = studentAddress1;
	}
	public String getStudentAddress2() {
		return studentAddress2;
	}
	public void setStudentAddress2(String studentAddress2) {
		this.studentAddress2 = studentAddress2;
	}
	public String getParentCountry() {
		return parentCountry;
	}
	public void setParentCountry(String parentCountry) {
		this.parentCountry = parentCountry;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	public String getParentZip() {
		return parentZip;
	}
	public void setParentZip(String parentZip) {
		this.parentZip = parentZip;
	}
	public String getStudentZip() {
		return studentZip;
	}
	public void setStudentZip(String studentZip) {
		this.studentZip = studentZip;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "PrgmGoalsRegistration [addedBy=" + addedBy + ", addedDt="
				+ addedDt + ", parentAddress1=" + parentAddress1
				+ ", parentAddress2=" + parentAddress2 + ", parentCountry="
				+ parentCountry + ", parentName=" + parentName
				+ ", parentPhone=" + parentPhone + ", parentZip=" + parentZip
				+ ", password=" + password + ", studentAddress1="
				+ studentAddress1 + ", studentAddress2=" + studentAddress2
				+ ", studentCountry=" + studentCountry + ", studentName="
				+ studentName + ", studentPhone=" + studentPhone
				+ ", studentZip=" + studentZip + ", updtBy=" + updtBy
				+ ", updtDt=" + updtDt + "]";
	}
}