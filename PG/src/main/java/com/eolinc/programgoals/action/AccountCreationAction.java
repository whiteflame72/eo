/*
 * COMPANY NAME: Education OnLine
 * COPYRIGHT
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 *
 */

package com.eolinc.programgoals.action;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.eolinc.dao.BaseDao;
import com.eolinc.dto.Profile;

public class AccountCreationAction extends TeacherParentInputAction {
	private static final long serialVersionUID = 1L;
	private BaseDao dao = new BaseDao();
	Logger log = Logger.getLogger(getClass().getName());

	private Long studentID = 0L;
	private String studentFirstName;
	private String studentLastName;
	private String studentEmail;

	public String execute() throws Exception {
		log.info("Info: Entering Account Creation Action");

        //Is this Action suppose to set profile also????
		//TODO need to complete this
		if (studentID == null || studentID == 0) {
			Date today = new Date();
			Profile profile = new Profile();
			profile.setAccountId(1L);
			profile.setProfileType('S');
			profile.setProfileFname(studentFirstName);
			profile.setProfileMname("");
			profile.setProfileLname(studentLastName);
			profile.setProfileSuffx("");
			profile.setProfileAddr1("");
			profile.setProfileAddr2("");
			profile.setProfileAddr3("");
			profile.setProfileCity("");
			profile.setProfileState("");
			profile.setProfileZip("");
			profile.setProfileCntry("");
			profile.setProfileAttn("");
			profile.setProfileBdayDt(today);
			profile.setProfileEmail(studentEmail);
			profile.setProfileTextMsg(1L);
			profile.setAddedDt(today);
			profile.setAddedBy("");
			profile.setUpdtDt(today);
			profile.setUpdtBy("");

			try {
				dao.save(profile);
			} catch (Exception e) {
				log.error("Exception in creation of Student ID");
			}
			//get ID
			try {
    			if(profile.getId() == null) {
    				studentID =0L;
    				log.info("Unable to set Student ID, set to 0");
    			} else {
    				studentID = profile.getId();
    				log.info("Teacher profile created");
    			}
			} catch (Exception e) {
				log.error("Exception in creation of Student ID");
			}
		}

		printTeacherInputBean();
		//updateTeacherQuestioner();
		//creatAnAcoount();
		
		//TODO need to put data in session.
		
		parentname = new String("TestParent");
		
		if (parentname != null) {
			if (log.isDebugEnabled()) {
				log.debug("Adding parentname to session");
			}
			this.session.put("ParentFirstName", parentname);
		} else {
			log.error("parent name is null");
			return "error";
		}


		return SUCCESS;
	}

    public boolean isValidEmailAddress(String emailAdrs){
      String  expression="^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$";
      CharSequence inputStr = emailAdrs;
      Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(inputStr);
      return matcher.matches();

    }

//	private boolean isInvalid(String value) {
//		return (value == null || value.isEmpty());
//	}


	private void printTeacherInputBean() {

//		log.debug("Student Name=" + studentfirstname);
//		log.debug("Student ID=" + getStudentID()); //From ID Generator?????
		log.debug("Student emailaddress=" + getEmailAddress());
		log.debug("Student Phone =" + "(" + getS_areaCode() + ")"
		    + getS_phoneNumber1() + getS_phoneNumber2());
		log.debug("Parent Phone =" + "(" + getP_areaCode() + ")"
		    + getP_phoneNumber1() + getP_phoneNumber2());
		log.debug("Student Address1 =" + getStudentAddress1());
		log.debug("Student Address2 =" + getStudentAddress2());
		log.debug("Student City =" + getStudentCity());
		log.debug("Student State =" + getStudentState());
		log.debug("Student Zip Code =" + getStudentZipCode1() + "-"+
		    getStudentZipCode2());
		log.debug("Student County =" + getStudentCounty());
		log.debug("Parent Name=" + getParentName());
		log.debug("Parent Phone =" + "(" + getS_areaCode() + ")"
		    + getS_phoneNumber1() + getS_phoneNumber2());
		log.debug("Parent Phone =" + "(" + getP_areaCode() + ")"
		    + getP_phoneNumber1() + getP_phoneNumber2());
		log.debug("Parent Address1 =" + getParentAddress1());
		log.debug("Parent Address2 =" + getParentAddress2());
		log.debug("Parent City =" + getParentCity());
		log.debug("Parent State =" + getParentState());
		log.debug("Parent Zip Code =" + getParentZipCode1() + "-"+
		    getParentZipCode2());
		log.debug("Parent County =" + getParentCounty());

	}


    private String emailaddress;

    public String getEmailAddress() {
		return emailaddress;
	}

	public void setEmailAddress(String emailadrs) {
		this.emailaddress = emailadrs;
	}

    private String loginpassword;

    public String getLoginPassword() {
		return loginpassword;
	}

	public void setLoginPassword(String loginPswd) {
		this.loginpassword = loginPswd;
	}

    private String verifyloginpassword;

    public String getVerifyLoginPassword() {
		return verifyloginpassword;
	}

	public void setVerifyLoginPassword(String verifyPsw) {
		this.verifyloginpassword = verifyPsw;
	}

    private String parentname;

	//@RequiredStringValidator(trim=true, message="Parent Name is required")
    public String getParentName() {
		return parentname;
	}

	public void setParentName(String parentName) {
		this.parentname = parentName;
	}

    private String studentname;

	//@RequiredStringValidator(trim=true, message="Student Name is required")
    public String getStudentName() {
		return studentname;
	}

	public void setStudentName(String studentName) {
		this.studentname = studentName;
	}

    private String p_areacode;

    public String getP_areaCode() {
		return p_areacode;
	}

	public void setP_areaCode(String parentareaCode) {
		this.p_areacode = parentareaCode;
	}

    private String p_phonenumber1;


    public String getP_phoneNumber1() {
		return p_phonenumber1;
	}


	public void setP_phoneNumber1(String parentPhoneNumber1) {
		this.p_phonenumber1 = parentPhoneNumber1;
	}

    private String p_phonenumber2;

    public String getP_phoneNumber2() {
		return p_phonenumber2;
	}

	public void setP_phoneNumber2(String parentPhoneNumber2) {
		this.p_phonenumber2 = parentPhoneNumber2;
	}

    private String s_areacode;

    public String getS_areaCode() {
		return s_areacode;
	}

	public void setS_areaCode(String studentareaCode) {
		this.p_areacode = studentareaCode;
	}

    private String s_phonenumber1;

    public String getS_phoneNumber1() {
		return s_phonenumber1;
	}

	public void setS_phoneNumber1(String studentPhoneNumber1) {
		this.s_phonenumber1 = studentPhoneNumber1;
	}

    private String s_phonenumber2;

    public String getS_phoneNumber2() {
		return s_phonenumber2;
	}

	public void setS_phoneNumber2(String studentPhoneNumber2) {
		this.s_phonenumber2 = studentPhoneNumber2;
	}

    private String parentaddress1;

	//@RequiredStringValidator(trim=true, message="Parent's addres is required")
    public String getParentAddress1() {
		return parentaddress1;
	}

	public void setParentAddress1(String parentAdrs1) {
		this.parentaddress1 = parentAdrs1;
	}

    private String studentaddress1;

	//@RequiredStringValidator(trim=true, message="Student's addres is required")
    public String getStudentAddress1() {
		return studentaddress1;
	}

	public void setStudentAddress1(String studentAdrs1) {
		this.studentaddress1 = studentAdrs1;
	}

    private String parentaddress2;

    public String getParentAddress2() {
		return parentaddress2;
	}

	public void setParentAddress2(String parentAdrs2) {
		this.parentaddress2 = parentAdrs2;
	}

    private String studentaddress2;

    public String getStudentAddress2() {
		return studentaddress2;
	}

	public void setStudentAddress2(String studentAdrs2) {
		this.studentaddress2 = studentAdrs2;
	}

    private String parentcity;

	//@RequiredStringValidator(trim=true, message="Parent's City is required")
    public String getParentCity() {
		return parentcity;
	}

	public void setParentCity(String parentCity) {
		this.parentcity = parentCity;
	}

    private String studentcity;

	//@RequiredStringValidator(trim=true, message="Student's City is required")
    public String getStudentCity() {
		return studentcity;
	}

	public void setStudentCity(String studentCity) {
		this.studentcity = studentCity;
	}

    private String parentstate;

	//@RequiredStringValidator(trim=true, message="Parent's State is required")
    public String getParentState() {
		return parentstate;
	}

	public void setParentState(String parentState) {
		this.parentstate = parentState;
	}

    private String studentstate;

	//@RequiredStringValidator(trim=true, message="Student's State is required")
    public String getStudentState() {
		return studentstate;
	}

	public void setStudentState(String studentState) {
		this.studentstate = studentState;
	}

    private String parentzipcode1;

	//@RequiredStringValidator(trim=true, message="Parent's ZipCode is required")
    public String getParentZipCode1() {
		return parentzipcode1;
	}

	public void setParentZipcode1(String parentZipCode1) {
		this.parentzipcode1 = parentZipCode1;
	}

    private String studentzipcode1;

	//@RequiredStringValidator(trim=true, message="Student's ZipCode is required")
    public String getStudentZipCode1() {
		return studentzipcode1;
	}

	public void setStudentZipCode1(String studentZipcode1) {
		this.studentzipcode1 = studentZipcode1;
	}

    private String parentzipcode2;

	//@RequiredStringValidator(trim=true, message="Parent's ZipCode is required")
    public String getParentZipCode2() {
		return parentzipcode2;
	}

	public void setParentZipcode2(String parentZipCode2) {
		this.parentzipcode2 = parentZipCode2;
	}

    private String studentzipcode2;

	//@RequiredStringValidator(trim=true, message="Student's ZipCode is required")
    public String getStudentZipCode2() {
		return studentzipcode2;
	}

	public void setStudentZipCode2(String studentZipcode2) {
		this.studentzipcode2 = studentZipcode2;
	}

    private String parentcounty;

	//@RequiredStringValidator(trim=true, message="Parent's County is required")
    public String getParentCounty() {
		return parentcounty;
	}

	public void setParentCounty(String parentCounty) {
		this.parentcounty = parentCounty;
	}

    private String studentcounty;

	//@RequiredStringValidator(trim=true, message="Student's County is required")
    public String getStudentCounty() {
		return studentcounty;
	}

	public void setStudentCounty(String studentCounty) {
		this.studentcounty = studentCounty;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


}



