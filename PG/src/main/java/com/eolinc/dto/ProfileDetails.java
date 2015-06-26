package com.eolinc.dto;

import java.util.Date;

public class ProfileDetails extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long profileId;
	private byte sessnLngthMin;
	private byte sessnLngthMax;
	private String grade;
	private Date addedDt = new Date();
	private String addedBy;
	private Date updtDt = new Date();
	private String updtBy;
	
	public Long getProfileDetailsId() {
		return id;
	}
	public void setProfileDetailsId(Long id) {
		this.id = id;
	}
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	public byte getSessnLngthMin() {
		return sessnLngthMin;
	}
	public void setSessnLngthMin(byte sessnLngthMin) {
		this.sessnLngthMin = sessnLngthMin;
	}
	public byte getSessnLngthMax() {
		return sessnLngthMax;
	}
	public void setSessnLngthMax(byte sessnLngthMax) {
		this.sessnLngthMax = sessnLngthMax;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
		return "ProfileDetails [addedBy=" + addedBy + ", addedDt=" + addedDt
				+ ", grade=" + grade + ", profileId=" + profileId
				+ ", sessnLngthMax=" + sessnLngthMax + ", sessnLngthMin="
				+ sessnLngthMin + ", updtBy=" + updtBy + ", updtDt=" + updtDt
				+ "]";
	}
}
