/*
 * COMPANY NAME: Education OnLine
 * COPYRIGHT                                       
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 * 
 */

package com.eolinc.programgoals.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.eolinc.dto.PrgmGoalsGradeScale;
import com.eolinc.dto.PrgmGoalsParentTrgt;
import com.eolinc.dto.PrgmGoalsRespondent;
import com.eolinc.dto.Profile;
import com.eolinc.dto.Student;
import com.eolinc.dto.StudentParentPair;
import com.eolinc.dto.StudentTeacherPair;
import com.eolinc.dto.Subject;
import com.eolinc.exception.EOLException;
import com.eolinc.programgoals.parentinput.SendTeacherQuestionerToParent;

@SuppressWarnings("unchecked")
public class ParentInputAction extends TeacherParentInputAction {
	private static final long serialVersionUID = 1L;
	
	private Long sendEmail;
	private String gpa;
	private String prevGpa;
	private String targetGpa;
	private String attendCollege;
	private String collegeYear;
	private Long collegeType;
	private Long assessment;
	private Long profileId;
	private Profile parent;
	private Profile student;
	private Profile teacher;
	private Subject subject;
	private int activity;
	private List<Profile> studentList = new ArrayList();
	
	public String execute() { 
    	logger.info("Entering Parent Input Action:execute");
		try {
			parent = (Profile) session.get("User");
	    	if (parent == null) return ERROR;
			parentId = parent.getProfileId();
	    	setParentViewFields();
    		List<StudentParentPair> sppList = dao.findByField(StudentParentPair.class, "parentId", parentId);
    		if (sppList != null && sppList.size() > 0) { // What is the business loggeric if there is none?
    			StudentParentPair spp = sppList.get(0); // What is the business loggeric if there is more than one?
    			studentId = spp.getStudentId();
    			setStudentViewFields();
	    		List<StudentTeacherPair> stpList = dao.findByField(StudentTeacherPair.class, "studentId", studentId);
	    		if (stpList != null && stpList.size() > 0) { // What is the business loggeric if there is none?
	    			StudentTeacherPair stp = stpList.get(0); // What is the business loggeric if there is more than one?
	    			teacherId = stp.getTeacherId();
	    			setTeacherViewFields();
	    		}
    		}
 		} catch (EOLException e) {
			handleError(e, "Error processing parents info.");
		}
		return SUCCESS;
    }
	
	public List<Profile> getStudentList() {
		List<StudentParentPair> sppList;
		try {
			sppList = dao.findByField(StudentParentPair.class, "parentId", parentId);
			Iterator itr = sppList.iterator();
			while (itr.hasNext()) {
				StudentParentPair spp = (StudentParentPair)itr.next();
				studentList.add((Profile)dao.find(Profile.class, spp.getStudentId()));
			}
		} catch (EOLException e) {
			handleError(e, "Error processing parents info.");		
		}
		return studentList;
	}


	private void setParentViewFields() throws EOLException {
		parent = (Profile)dao.find(Profile.class, parentId);
		parentFirstName = parent.getProfileFname();
		parentLastName = parent.getProfileLname();
		parentEmail = parent.getProfileEmail();		
		parentFullName = parentFirstName + " " + parentLastName;
	}
	private void setStudentViewFields() throws EOLException {
		student = (Profile)dao.find(Profile.class, studentId);
		studentFirstName = student.getProfileFname();
		studentLastName = student.getProfileLname();
		studentFullName = studentFirstName + " " + studentLastName;
		List<Student> stList = dao.findByField(Student.class, "profileId", studentId); // Get student info
		if (stList == null || stList.size() == 0) throw new EOLException("No student info associated with the student profile.");
		if (stList.size() >1 ) throw new EOLException("Too many student associated with the student profile.");
		Student st = stList.get(0);
		studentsGrade = st.getGrade();
	}
	private void setTeacherViewFields() throws EOLException {
		teacher = (Profile)dao.find(Profile.class, teacherId);
		teacherFirstName = teacher.getProfileFname();
		teacherLastName = teacher.getProfileLname();
		teacherFullName = teacherFirstName + " " + teacherLastName;
	}

	public String updateForm() throws EOLException { 

    	logger.info("Entering Parent Input Action:updateForm");	
     	Date today = new Date();
 
    	//This is only needed if we cannot find the ID in session.
        if (studentId == null || studentId == 0) {
        	logger.info("Creating new Student Id");
        	student = new Profile();
        	student.setAccountId(1L);  // This is not the right way - Saeid
        	student.setProfileType('S');
        	student.setProfileMname("");
        	student.setProfileSuffx("");
        	student.setProfileAddr1("");
        	student.setProfileAddr2("");
        	student.setProfileAddr3("");
        	student.setProfileCity("");
        	student.setProfileState("");
        	student.setProfileZip("");
        	student.setProfileCntry("");
        	student.setProfileAttn("");
        	student.setProfileBdayDt(today); //FIXME This should be BDay
        	student.setProfileEmail("");
        	student.setProfileTextMsg(1L);
        	try {
				student.setAddedBy(getCurrentUserName());
			} catch (Exception e) {
				e.printStackTrace();
			} 
        	student.setAddedDt(today);
        } else {
        	student = (Profile)dao.find(Profile.class, studentId);
        	setParentViewFields();
        }
        student.setProfileFname(studentFirstName);
        student.setProfileLname(studentLastName);
       	student.setUpdtDt(today);
    	student.setUpdtBy("test"); // This should be username
      	
    	try {
    		dao.save(student);  //Should only do this for a new student
		} catch (EOLException e) {
			handleError(e, "Exception in Updating Student Profile");
		}
		
     	 //This is only needed if we cannot find the ID in session.
         if (parentId == null || parentId == 0) {
         	logger.info("Creating new Parent Id");
        	parent = new Profile();
        	parent.setAccountId(1L);
        	parent.setProfileType('P');
        	parent.setProfileMname("");
        	parent.setProfileSuffx("");
        	parent.setProfileAddr1("");
        	parent.setProfileAddr2("");
        	parent.setProfileAddr3("");
        	parent.setProfileCity("");
        	parent.setProfileState("");
        	parent.setProfileZip("");
        	parent.setProfileCntry("");
        	parent.setProfileAttn("");
        	parent.setProfileBdayDt(today);
        	parent.setProfileTextMsg(1L);
        	try {
				parent.setAddedBy(getCurrentUserName());
			} catch (Exception e) {
				e.printStackTrace();
			}
        	parent.setAddedDt(today);
         } else {
        	 parent = (Profile)dao.find(Profile.class, parentId);
         }
    	parent.setProfileFname(parentFirstName);
    	parent.setProfileLname(parentLastName);
    	parent.setProfileEmail(parentEmail);
    	parent.setUpdtDt(today);
    	parent.setUpdtBy("username");
    	try {
			dao.save(parent);  //Should only do this for a new parent
		} catch (EOLException e) {
			handleError(e, "Exception in Updating Parent Profile");
         }
         
        printParentInputBean();
        
        return updateParentQuestioner();
     }
    	
    public String send() {
    	logger.info("Send E-mail pressed");
 
    	SendTeacherQuestionerToParent sendLetter = new SendTeacherQuestionerToParent();
    	String teacher = teacherFirstName + " " + teacherLastName;
    	String parent = parentFirstName + " " + parentLastName;
    	String student = studentFirstName + " " + studentLastName;
    	String phone = "000-000-0000";
    	//String url = "http://127.0.0.1:8080/EOLProgramGoals/teacher_input_form.action?"+  //Local url for testing
    	String url = "http://eoldev2.eoldevsite.com:9090/EOLProgramGoals/teacher_input_form.action?"+
    		"studentLastName="+studentLastName+
			"&studentFirstName="+studentFirstName+
			"&studentId="+studentId+
			"&parentLastName="+parentLastName+
			"&parentFirstName="+parentFirstName+
			"&teacherLastName="+teacherLastName+
			"&teacherFirstName="+teacherFirstName;
    	sendLetter.ModifyAndSendQuestioner(parentEmail, teacher, parent, student, parentEmail, phone, url);
    	
        return "emailSent";
    }
    

    public String updateParentQuestioner() {
    	try {
    		updateRespondentTable();
    		updateGradeScaleTables();
			updateParentTargetTable();
			updateWorkHbitsTable();
			updateLearningStyleTable();
			updateSkillSetsTable();
			updateApplKnwlgTable();
    		
	        if (respondentId == 0) {
	        	logger.error("Respondent ID = 0!!!");
	        } else {
	        	logger.info("Respondent ID = "  + respondentId);
	        }
	        
		} catch (EOLException e) {
			return handleError(e, "Exception while updating Parent Input");
		}
		
		if (sendEmail != null && sendEmail == 1) {
			return send();
		} else {
			return "thanks";
		}
	}	
    
	//TODO need to set goal table
	//TODO need to set student table
    //TODO need to set student/parent pair table
	//TODO need to set student/teacher pair table
	

    
	enum respondentType {TEACHER, PARENT, STUDENT};	
    	
	public void updateRespondentTable () throws EOLException {
    		
    	//Respondent Table
    	// If a parent responds more than once for a student, do we create a new row?
    	PrgmGoalsRespondent respondent = new PrgmGoalsRespondent();
    	try {
			respondent.setPrgmGoalsRespondentId(getCurrentRespondentId());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
    	respondent.setRespondentDt(new Date());
    	try {
			respondent.setAddedBy(getCurrentUserName());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
    	respondent.setRespondentType(respondentType.PARENT.toString());//
    	respondent.setStudentId(studentId);	//Student Table
    	respondent.setTeacherId(teacherId);	//Teacher Table
    	respondent.setSubjectId(subjectId);	//Subject table
    	respondent.setStudentRank(new BigDecimal(studentsGrade));//This is the grade level 1-12
    	//respondent.setGradePctg(new BigDecimal(convertGradeToFloat(getGpa())));  //TODO This won't work because respondent Id is not set yet
    	respondent.setGradePctg(new BigDecimal(0.0));
    	respondent.setUpdtDt(new Date());
    	try {
			respondent.setAddedBy(getCurrentUserName());
			respondent.setUpdtBy(getCurrentUserName());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
 		dao.save(respondent);
 		setRespondentId(respondent.getPrgmGoalsRespondentId());
    }

    public void updateParentTargetTable() throws EOLException {
    	// Parent Target Table
    	PrgmGoalsParentTrgt target = new PrgmGoalsParentTrgt();
    	try {
			target.setPrgmGoalsParentTrgtId(getCurrentParentTargetId());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	target.setRespondentId(this.respondentId);
   		target.setCollege((attendCollege));    	
    	target.setCollegeTypeId(collegeType);
    	target.setCollegeYr(Byte.valueOf(collegeYear.substring(2, 4)));	// TODO This is stored a a TINYINT, need a better way to do this.
    	target.setGradePctgAvg(BigDecimal.valueOf(convertGradeToFloat(getGpa())));
    	target.setGradePctgLastYr(BigDecimal.valueOf(convertGradeToFloat(getPrevGpa())));	
    	if (convertGradeToFloat(getTargetGpa()) > 99) {setTargetGpa("99");};
    	target.setGradePctgTrgt(BigDecimal.valueOf(convertGradeToFloat(getTargetGpa())));// Must be less than 100	
    	
 		dao.save(target);
    }


    /*
     * User may input GPA as a Percent, Letter Grade, or numerical Grade Point
     * Percent is stored in the DB
     * 
     * If user enters a %, no conversion or normalization is necessary.
     * If user enters a letter grade, it is converted and normalized per the grade scale table.
     * If user enters a gpa (0-4.5), it is converted to a percent.
     */
    private float convertGradeToFloat(String gradeAsStr) throws EOLException {
    	float gpa = 0;
    	
    	if (gradeAsStr == null || gradeAsStr.equals("")) {
    		gradeAsStr = "0";
    	}

    	try {
    		gpa = new Float(gradeAsStr);
    		//a percent is expected, it a number is < 5 assume GPA and convert to percent.
    		if (gpa < 5) {
    			gpa = (gpa*10)+55;	//Don't know if this is correct.
    			logger.info("GPA entered < 5, converted to percent: " + gpa);
    		}
    		
    	} catch (NumberFormatException e) {
    		String upperCaseGrade = gradeAsStr.toUpperCase().trim();
    		List<PrgmGoalsGradeScale> gradeList = dao.findBy2Fields(PrgmGoalsGradeScale.class, "respondentId", respondentId, "gradeScaleId", upperCaseGrade);
    		PrgmGoalsGradeScale grade = gradeList.get(0);
    		gpa = (grade.getGradeUpperBnd().floatValue() + grade.getGradeLowerBnd().floatValue())/2;
    	}
    	return gpa;
    }

    public String getLetterGrade(float rawGPA) {
    	
    	String[] grades = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
    	float percent = (rawGPA*10)+55;	//Don't know if this is correct.

    	String normalizedGPA = "";
    	for (String index : grades) {
    		List<PrgmGoalsGradeScale> gradeList = null;
			try {
				gradeList = dao.findBy2Fields(PrgmGoalsGradeScale.class, "respondentId", respondentId, "gradeScaleId", index);
	    		BigDecimal upperGrade = gradeList.get(0).getGradeUpperBnd();
	    		BigDecimal lowerGrade = gradeList.get(0).getGradeLowerBnd();
	    		if (percent <= upperGrade.floatValue() && percent > lowerGrade.floatValue()) {
	    			normalizedGPA = gradeList.get(0).getGradeScaleId();
	    			break;
	    		}
	    		
			} catch (EOLException e) {
				handleError(e, "Error processing parents info.");
			}
    	}	
    	return normalizedGPA;
    }
    
    
    private void printParentInputBean() {
    	logger.debug("Student First Name=" + studentFirstName);
    	logger.debug("Student Last Name=" +studentLastName);
    	logger.debug("Student Id=" + studentId);
    	logger.debug("Parent First Name=" + parentFirstName);
    	logger.debug("Parent Last Name=" + parentLastName);
    	logger.debug("Teacher First Name=" + teacherFirstName);
    	logger.debug("Teacher Last Name=" + teacherLastName);
    	logger.debug("Teacher Id=" + teacherId);
    	logger.debug("Subject=" + subjectId);
    	logger.debug("Gradelevel=" + gradeLevel);
    	logger.debug("Gradelevel Other=" + gradeLevelOther);
    	logger.debug("Student Grade=" + studentsGrade);
    	logger.debug("A+ =" + Aplus);
    	logger.debug("A upper =" + Aupper);
    	logger.debug("A lower =" + Alower);
    	logger.debug("A- upper =" + Aminuslower);
    	logger.debug("A- lower =" + Aminusupper);
    	logger.debug("B+ upper =" + Bplusupper);
    	logger.debug("B+ lower =" + Bpluslower);
    	logger.debug("B upper =" + Bupper);
    	logger.debug("B lower =" + Blower);
    	logger.debug("B- upper =" + Bminuslower);
    	logger.debug("B- lower =" + Bminusupper);
    	logger.debug("C+ upper =" + Cplusupper);
    	logger.debug("C+ lower =" + Cpluslower);
    	logger.debug("C upper =" + Cupper);
    	logger.debug("C lower =" + Clower);
    	logger.debug("C- upper =" + Cminuslower);
    	logger.debug("C- lower =" + Cminusupper);
    	logger.debug("D+ upper =" + Dplusupper);
    	logger.debug("D+ lower =" + Dpluslower);
    	logger.debug("D upper =" + Dupper);
    	logger.debug("D lower =" + Dlower);
    	logger.debug("D- upper =" + Dminuslower);
    	logger.debug("D- lower =" + Dminusupper);
    	logger.debug("F upper =" + Fupper);
    	logger.debug("F lower =" + Flower);
    	logger.debug("Any style =" + anyStyle);
    	logger.debug("Real World =" + realWorldExamples);
    	logger.debug("Simpler explanations =" + simplerExplanations);
    	logger.debug("Visual =" + visual);
    	logger.debug("Auditory =" + auditory);
    	logger.debug("Hands on =" + handson);
    	logger.debug("Deductive =" + deductive);
    	logger.debug("Inductive =" + inductive);
    	logger.debug("Completes Assignments =" + completesAssignments);
    	logger.debug("Shows Solution =" + showsSolution);
    	logger.debug("Focus =" + focus);
    	logger.debug("Accuracy =" + accuracy);
    	logger.debug("Organized =" + organized);
       	logger.debug("Prepared =" + prepared);
       	logger.debug("Computational Accurately =" + computationalAccurately);
       	logger.debug("Calculator =" + calculator);
       	logger.debug("Retention =" + retention);
       	logger.debug("Formula Selection =" + formulaSelection);
      	logger.debug("Abstract Concepts =" + abstractConcepts);
      	logger.debug("loggerical Thought =" + logicalThought);
      	logger.debug("Low Level Problem =" + lowLevelProblem);
      	logger.debug("Med Level Problem =" + medLevelProblem);
      	logger.debug("High Level Problem =" + highLevelProblem);
      	logger.debug("Single Step Problem =" + singleStepProblem);
      	logger.debug("Multi Step Problem =" + multipleStepProblem);
      	logger.debug("Real World Problem =" + realWorldProblems);
      	logger.debug("Integrated Problem =" + integratedProblems);
    }
    
	public Long getSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(Long sendEmail) {
		this.sendEmail = sendEmail;
	}    
    
	
	public String getAttendCollege() {
		return attendCollege;
	}

	public void setAttendCollege(String attendCollege) {
		this.attendCollege = attendCollege;
	}

	
	public String getCollegeYear() {
		return collegeYear;
	}

	public void setCollegeYear(String collegeYear) {
		this.collegeYear = collegeYear;
	}
	
	
	public Long getCollegeType() {
		return collegeType;
	}

	public void setCollegeType(Long collegeType) {
		this.collegeType = collegeType;
	}
	
	public Long getAssessment() {
		return assessment;
	}

	public void setAssessment(Long assessment) {
		this.assessment = assessment;
	}
	
    public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	public String getPrevGpa() {
		return prevGpa;
	}
	public void setPrevGpa(String prevGpa) {
		this.prevGpa = prevGpa;
	}
	public String getTargetGpa() {
		return targetGpa;
	}
	public void setTargetGpa(String targetGpa) {
		this.targetGpa = targetGpa;
	}

	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
    public Profile getParent() {
		return parent;
	}
	public Profile getTeacher() {
		return teacher;
	}
	public Profile getStudent() {
		return student;
	}
	public Subject getSubject() {
		return subject;
	}

	//TODO this code should be moved to a common class for teacher and parent input
	private String getCurrentUserName() throws Exception {
		if(session.get("User") == null) {
			addActionError("Invalid session, please login first!");
			throw new Exception("Invalid session, please login first!");
		}
		return ((Profile) session.get("User")).getFullName();
	}

	//TODO this code should be moved to a common class for teacher and parent input	
	private Long getCurrentRespondentId() throws Exception {
		if(session.get("User") == null) {
			addActionError("Invalid session, please login first!");
			throw new Exception("Invalid session, please login first!");
		}
		return ((Profile) session.get("User")).getId();
	}
	
	//TODO this code should be moved to a common class for teacher and parent input	
	private Long getCurrentParentTargetId() throws Exception {
		if(session.get("User") == null) {
			addActionError("Invalid session, please login first!");
			throw new Exception("Invalid session, please login first!");
		}
		return ((Profile) session.get("User")).getProfileId();
	}
	
}