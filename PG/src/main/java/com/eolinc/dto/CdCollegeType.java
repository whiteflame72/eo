package com.eolinc.dto;

import java.math.BigDecimal;

public class CdCollegeType extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String collegeTypeDesc;
	private BigDecimal collegeGpa;
	private short collegeSat;
	private short collegeAct;
	
	public Long getCdCollegeTypeId() {
		return id;
	}
	public void setCdCollegeTypeId(Long id) {
		this.id = id;
	}
	public String getCollegeTypeDesc() {
		return collegeTypeDesc;
	}
	public void setCollegeTypeDesc(String collegeTypeDesc) {
		this.collegeTypeDesc = collegeTypeDesc;
	}
	public BigDecimal getCollegeGpa() {
		return collegeGpa;
	}
	public void setCollegeGpa(BigDecimal collegeGpa) {
		this.collegeGpa = collegeGpa;
	}
	public short getCollegeSat() {
		return collegeSat;
	}
	public void setCollegeSat(short collegeSat) {
		this.collegeSat = collegeSat;
	}
	public short getCollegeAct() {
		return collegeAct;
	}
	public void setCollegeAct(short collegeAct) {
		this.collegeAct = collegeAct;
	}
	@Override
	public String toString() {
		return "CdCollegeType [collegeAct=" + collegeAct + ", collegeGpa="
				+ collegeGpa + ", collegeSat=" + collegeSat
				+ ", collegeTypeDesc=" + collegeTypeDesc + "]";
	}
}
