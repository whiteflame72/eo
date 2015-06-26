package com.eolinc.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="profile")
public class Profile extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long accountId;
	private Character profileType;
	private String profileFname;
	private String profileMname;
	private String profileLname;
	private String profileSuffx;
	private String profileAddr1;
	private String profileAddr2;
	private String profileAddr3;
	private String profileCity;
	private String profileState;
	private String profileZip;
	private String profileCntry;
	private String profileAttn;
	private Date profileBdayDt;
	private String profileEmail;
	private Long profileTextMsg;
	private Date addedDt = new Date();
	private String addedBy;
	private Date updtDt = new Date();
	private String updtBy;
	
	@Transient
	public String getFullName() {
		return profileLname + ", " + profileFname;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id @Column(name="PROFILE_ID")
	public Long getProfileId() {
		return id;
	}
	public void setProfileId(Long id) {
		this.id = id;
	}
	@Column(name="ACCOUNT_ID")
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	@Column(name="PROFILE_TYPE")
	public Character getProfileType() {
		return profileType;
	}
	public void setProfileType(Character profileType) {
		this.profileType = profileType;
	}
	@Column(name="PROFILE_FNAME")
	public String getProfileFname() {
		return profileFname;
	}
	public void setProfileFname(String profileFname) {
		this.profileFname = profileFname;
	}
	@Column(name="PROFILE_MNAME")
	public String getProfileMname() {
		return profileMname;
	}
	public void setProfileMname(String profileMname) {
		this.profileMname = profileMname;
	}
	@Column(name="PROFILE_LNAME")
	public String getProfileLname() {
		return profileLname;
	}
	public void setProfileLname(String profileLname) {
		this.profileLname = profileLname;
	}
	@Column(name="PROFILE_SUFFX")
	public String getProfileSuffx() {
		return profileSuffx;
	}
	public void setProfileSuffx(String profileSuffx) {
		this.profileSuffx = profileSuffx;
	}
	@Column(name="PROFILE_ADDR1")
	public String getProfileAddr1() {
		return profileAddr1;
	}
	public void setProfileAddr1(String profileAddr1) {
		this.profileAddr1 = profileAddr1;
	}
	@Column(name="PROFILE_ADDR2")
	public String getProfileAddr2() {
		return profileAddr2;
	}
	public void setProfileAddr2(String profileAddr2) {
		this.profileAddr2 = profileAddr2;
	}
	@Column(name="PROFILE_ADDR3")
	public String getProfileAddr3() {
		return profileAddr3;
	}
	public void setProfileAddr3(String profileAddr3) {
		this.profileAddr3 = profileAddr3;
	}
	@Column(name="PROFILE_CITY")
	public String getProfileCity() {
		return profileCity;
	}
	public void setProfileCity(String profileCity) {
		this.profileCity = profileCity;
	}
	@Column(name="PROFILE_STATE")
	public String getProfileState() {
		return profileState;
	}
	public void setProfileState(String profileState) {
		this.profileState = profileState;
	}
	@Column(name="PROFILE_ZIP")
	public String getProfileZip() {
		return profileZip;
	}
	public void setProfileZip(String profileZip) {
		this.profileZip = profileZip;
	}
	@Column(name="PROFILE_CNTRY")
	public String getProfileCntry() {
		return profileCntry;
	}
	public void setProfileCntry(String profileCntry) {
		this.profileCntry = profileCntry;
	}
	@Column(name="PROFILE_ATTN")
	public String getProfileAttn() {
		return profileAttn;
	}
	public void setProfileAttn(String profileAttn) {
		this.profileAttn = profileAttn;
	}
	@Column(name="PROFILE_BDAY_DT")
	public Date getProfileBdayDt() {
		return profileBdayDt;
	}
	public void setProfileBdayDt(Date profileBdayDt) {
		this.profileBdayDt = profileBdayDt;
	}
	@Column(name="PROFILE_EMAIL")
	public String getProfileEmail() {
		return profileEmail;
	}
	public void setProfileEmail(String profileEmail) {
		this.profileEmail = profileEmail;
	}
	@Column(name="PROFILE_TEXT_MSG")
	public Long getProfileTextMsg() {
		return profileTextMsg;
	}
	public void setProfileTextMsg(Long profileTextMsg) {
		this.profileTextMsg = profileTextMsg;
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
		return "Profile [accountId=" + accountId + ", addedBy=" + addedBy
				+ ", addedDt=" + addedDt + ", profileAddr1=" + profileAddr1
				+ ", profileAddr2=" + profileAddr2 + ", profileAddr3="
				+ profileAddr3 + ", profileAttn=" + profileAttn
				+ ", profileBdayDt=" + profileBdayDt + ", profileCity="
				+ profileCity + ", profileCntry=" + profileCntry
				+ ", profileEmail=" + profileEmail + ", profileFname="
				+ profileFname + ", profileLname="
				+ profileLname + ", profileMname=" + profileMname
				+ ", profileState=" + profileState + ", profileSuffx="
				+ profileSuffx + ", profileTextMsg=" + profileTextMsg
				+ ", profileType=" + profileType + ", profileZip=" + profileZip
				+ ", updtBy=" + updtBy + ", updtDt=" + updtDt + "]";
	}
}
