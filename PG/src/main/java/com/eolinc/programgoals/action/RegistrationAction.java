/*
 * COMPANY NAME: Education OnLine
 * COPYRIGHT
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 *
 */

package com.eolinc.programgoals.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.eolinc.action.BaseAction;



//@SuppressWarnings("serial")
//public class RegistrationAction extends ActionSupport {

public class RegistrationAction extends BaseAction{
	private static final long serialVersionUID = 6197464145133578858L;
	Logger log = Logger.getLogger(getClass().getName());

	public String execute() throws Exception {


		log.info("Info: Entering Registration Action");


		printRegistrationInputBean();
		//updateRegistrationTable();
		//creatAnAcoount();
		
		
		addSessionVariables();
		

		return SUCCESS;
	}

	
	private void addSessionVariables() {

		if (getParentLastName() != null) {
			log.info("Adding parentlastname to session");
			this.session.put("ParentLastName", getParentLastName());
		} else {
			log.error("ParentLastName is null");
		}
		
		if (getParentFirstName() != null) {
			log.info("Adding parentfirstname to session");
			this.session.put("ParentFirstName", getParentFirstName());
		} else {
			log.error("ParentFirstName is null");
		}

		if (getStudentLastName() != null) {
			log.info("Adding studentlastname to session");
			this.session.put("StudentLastName", getStudentLastName());
		} else {
			log.error("StudentLastName is null");
		}
		
		if (getStudentFirstName() != null) {
			log.info("Adding studentfirstname to session");
			this.session.put("StudentFirstName", getStudentFirstName());
		} else {
			log.error("StudentFirstName is null");
		}
		
		if (getEmailAddress() != null) {
			log.info("Adding email to session");
			this.session.put("Email", getEmailAddress());
		} else {
			log.error("email is null");
		}
		
		return;
	}
	
	
    public boolean isValidEmailAddress(String emailAdrs){
      String  expression="^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$";
      CharSequence inputStr = emailAdrs;
      Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(inputStr);
      return matcher.matches();

    }
	/*public void updateRegistrationTable() {
		//Work Habits Table
		PrgmGoalsRegistration registration = new PrgmGoalsRegistration();
		//registration.setRespondentId(this.getRespondentID());
		//registration.setCompletesAssignments(this.getCompletesassignments());
		registration.setParentLastName(getParentLastName());
		registration.setParentFirstName(getParentFirstName());		
		registration.setStudentLastName(getStudentLastName());
		registration.setStudentFirstName(getStudentFirstName());		
		registration.setParentAddress1(getParentAddress1());
		registration.setParentAddress2(getParentAddress2());
		registration.setStudentAddress1(getStudentAddress1());
		registration.setStudentAddress2(getStudentAddress2());
		registration.setParentCounty(getParentCounty());
		registration.setStudentCounty(getStudentCounty());
		registration.setParentZipCode(getParentZipCode1() + "-" +
				     getParentZipCode2());
		registration.setStudentZipCode(getStudentZipCode1() + "-" +
			     getStudentZipCode2());
		registration.setParentPhone("(" + getP_areaCode() + ")" + getP_phoneNumber1()
				+  "-" + getP_phoneNumber2());
		registration.setStudentPhone("(" + getS_areaCode() + ")" + getS_phoneNumber1()
				+  "-" + getS_phoneNumber2());
		registration.setPassword(getPassword());

		PrgmGoalsRegistrationImpl work = new PrgmGoalsRegistrationImpl();
      	try {
			work.insertUpdate(registration);
		} catch (Exception e) {
			log.error("Exception in Updating Registration");
		}
	}*/

	private boolean isInvalid(String str) {
		return ((str == null) || (str.compareTo("") == 0));
	}


	private void printRegistrationInputBean() {

        //log.debug
		System.out.println("Student Last Name=" + getStudentLastName());
		System.out.println("Student First Name=" + getStudentFirstName());		
		//System.out.println("Student ID=" + getStudentID()); //From ID Generator?????
		System.out.println("Student emailaddress=" + getEmailAddress());
		System.out.println("Student Phone =" + "(" + getS_areaCode() + ")"
		    + getS_phoneNumber1() + getS_phoneNumber2());
		System.out.println("Parent Phone =" + "(" + getP_areaCode() + ")"
		    + getP_phoneNumber1() + getP_phoneNumber2());
		System.out.println("Student Address1 =" + getStudentAddress1());
		System.out.println("Student Address2 =" + getStudentAddress2());
		System.out.println("Student City =" + getStudentCity());
		System.out.println("Student State =" + getStudentState());
		System.out.println("Student Zip Code =" + getStudentZipcode1() + "-" +
		    getStudentZipcode2());
		System.out.println("Student County =" + getStudentCounty());
		System.out.println("Parent Last Name=" + getParentLastName());
		System.out.println("Parent First Name=" + getParentFirstName());		
		System.out.println("Parent Phone =" + "(" + getS_areaCode() + ")"
		    + getS_phoneNumber1() + getS_phoneNumber2());
		System.out.println("Parent Phone =" + "(" + getP_areaCode() + ")"
		    + getP_phoneNumber1() + getP_phoneNumber2());
		System.out.println("Parent Address1 =" + getParentAddress1());
		System.out.println("Parent Address2 =" + getParentAddress2());
		System.out.println("Parent City =" + getParentCity());
		System.out.println("Parent State =" + getParentState());
		System.out.println("Parent Zip Code =" + getParentZipCode1() + "-" +
		    getParentZipCode1());
		System.out.println("Parent County =" + getParentCounty());

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

    private String parentlastname;

	//@RequiredStringValidator(trim=true, message="Parent Last Name is required")
    public String getParentLastName() {
		return parentlastname;
	}

	public void setParentLastName(String parentLastName) {
		this.parentlastname = parentLastName;
	}

    private String parentfirstname;

	//@RequiredStringValidator(trim=true, message="Parent First Name is required")
    public String getParentFirstName() {
		return parentfirstname;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentfirstname = parentFirstName;
	}

    private String studentlastname;

	//@RequiredStringValidator(trim=true, message="Student Last Name is required")
    public String getStudentLastName() {
		return studentlastname;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentlastname = studentLastName;
	}

    private String studentfirstname;

	//@RequiredStringValidator(trim=true, message="Student First Name is required")
    public String getStudentFirstName() {
		return studentfirstname;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentfirstname = studentFirstName;
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
    public String getStudentZipcode1() {
		return studentzipcode1;
	}

	public void setStudentZipcode1(String studentZipcode1) {
		this.studentzipcode1 = studentZipcode1;
	}

    private String parentzipcode2;

	//@RequiredStringValidator(trim=true, message="Parent's ZipCode is required")
    public String getParentZipcode2() {
		return parentzipcode2;
	}

	public void setParentZipcode2(String parentZipCode2) {
		this.parentzipcode2 = parentZipCode2;
	}

    private String studentzipcode2;

	//@RequiredStringValidator(trim=true, message="Student's ZipCode is required")
    public String getStudentZipcode2() {
		return studentzipcode2;
	}

	public void setStudentZipcode2(String studentZipcode2) {
		this.studentzipcode2 = studentZipcode2;
	}

    private String parentCounty;

	//@RequiredStringValidator(trim=true, message="Parent's County is required")
    public String getParentCounty() {
		return parentCounty;
	}

	public void setParentCounty(String parentCounty) {
		this.parentCounty = parentCounty;
	}

    private String studentcounty;

	//@RequiredStringValidator(trim=true, message="Student's County is required")
    public String getStudentCounty() {
		return studentcounty;
	}

	public void setStudentCounty(String studentCounty) {
		this.studentcounty = studentCounty;
	}
	

}



