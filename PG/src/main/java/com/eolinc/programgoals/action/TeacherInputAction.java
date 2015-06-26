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
import java.util.Date;
import java.util.List;

import com.eolinc.dto.PrgmGoalsRespondent;
import com.eolinc.dto.Profile;
import com.eolinc.dto.Student;
import com.eolinc.dto.StudentParentPair;
import com.eolinc.dto.StudentTeacherPair;
import com.eolinc.dto.Subject;
import com.eolinc.exception.EOLException;

public class TeacherInputAction extends TeacherParentInputAction {
	private static final long serialVersionUID = 1L;

	private Profile student;
	private Profile teacher;
	private Profile parent;


	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		logger.info("Info: Entering Teacher Input Action: execute");
		//TODO This is for the demo only.  Need to change it for production.
		//If we come from a registration page this should work.  
		try {
			teacher = (Profile) session.get("User");
			if (teacher == null) return ERROR;
			teacherId = teacher.getProfileId();
			setTeacherViewFields();
			List<StudentTeacherPair> stpList = dao.findByField(StudentTeacherPair.class, "teacherId", teacherId);
			if (stpList != null && stpList.size() > 0) { 
				StudentTeacherPair stp = stpList.get(0); // What is the business loggeric if there is more than one?
				studentId = stp.getStudentId();
				setStudentViewFields();
				List<StudentParentPair> sppList = dao.findByField(StudentParentPair.class, "studentId", studentId);
				if (sppList != null && sppList.size() > 0) { 
					StudentParentPair spp = sppList.get(0); 
					parentId = spp.getParentId();
					setParentViewFields();
				} else {
					logger.error("Unable to find parent for student Id = " + studentId);
				}
				if (sppList.size() > 1) {
					logger.info("Multiple parents found for student Id = " + studentId);
				}				
			} else {
				logger.error("Unable to find student for teacher Id = " + teacherId);
			}
		} catch (EOLException e) {
			handleError(e, "Error processing students info.");
		}
		return SUCCESS;
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
	}
	
	private void setTeacherViewFields() throws EOLException {
		teacher = (Profile)dao.find(Profile.class, teacherId);
		teacherFirstName = teacher.getProfileFname();
		teacherLastName = teacher.getProfileLname();
		teacherFullName = teacherFirstName + " " + teacherLastName;
	}


	public String updateForm() throws EOLException { 

    	logger.info("Entering Teacher Input Action:updateForm");	
    	
    	//if not found, create one.
 		if (teacherId == null || teacherId == 0) {
			Date today = new Date();
			Profile profile = new Profile();
			profile.setAccountId(1L);
			profile.setProfileType('T');
			profile.setProfileFname(teacherFirstName);
			profile.setProfileMname("");
			profile.setProfileLname(teacherLastName);
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
			profile.setProfileEmail(teacherEmail);
			profile.setProfileTextMsg(1L);
			profile.setAddedBy("");
			profile.setUpdtDt(today);
			profile.setUpdtBy("");
			

			try {
				dao.save(profile);
			} catch (EOLException e) {
				handleError(e, "Exception in creation of Teacher ID");
			}
			if(profile.getId() == null) {
				teacherId =0L;
				logger.info("Unable to set Teacher ID, set to 0");
			} else {
				teacherId = profile.getId();
				logger.info("Teacher profile created");
			} 
		}
          
     
        printTeacherInputBean();
        return updateTeacherQuestioner();
     }


	public String updateTeacherQuestioner() {
		try {
			updateRespondentTable();
			updateWorkHbitsTable();
			updateLearningStyleTable();
			updateSkillSetsTable();
			updateApplKnwlgTable();
			updateGradeScaleTables();
		} catch (EOLException e) {
			return handleError(e, "Exception while updating Teacher Input");
		}
		return "thanks";
	}	
	
	private void printTeacherInputBean() {

		logger.debug("Student First Name=" + studentFirstName);
		logger.debug("Student Last Name=" + studentLastName);
		logger.debug("Student ID=" + studentId);
		logger.debug("Parent First Name=" + parentFirstName);
		logger.debug("Parent Last Name=" + parentLastName);
		logger.debug("Teacher First Name=" + teacherFirstName);
		logger.debug("Teacher Last Name=" + teacherLastName);
		logger.debug("Teacher ID=" + teacherId);
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
		logger.debug("Logical Thought =" + logicalThought);
		logger.debug("Low Level Problem =" + lowLevelProblem);
		logger.debug("Med Level Problem =" + medLevelProblem);
		logger.debug("High Level Problem =" + highLevelProblem);
		logger.debug("Single Step Problem =" + singleStepProblem);
		logger.debug("Multi Step Problem =" + multipleStepProblem);
		logger.debug("Real World Problem =" + realWorldProblems);
		logger.debug("Integrated Problem =" + integratedProblems);
	}

	enum respondentType {TEACHER, PARENT, STUDENT};	
	
    public void updateRespondentTable () throws EOLException {
    		
    	//Respondent Table
    	PrgmGoalsRespondent respondent = new PrgmGoalsRespondent();
    	 
    	try {
	    	respondent.setRespondentDt(new Date()); 
	    	respondent.setPrgmGoalsRespondentId(getCurrentRespondentId());
	    	respondent.setRespondentType(respondentType.TEACHER.toString());//
	    	respondent.setStudentId(studentId);	//Student Table
	    	respondent.setTeacherId(teacherId);	//Teacher Table
	    	respondent.setSubjectId(subjectId);	//Subject table
	    	respondent.setStudentRank(new BigDecimal(studentsGrade));//This is the grade level 1-12
	    	respondent.setGradePctg(new BigDecimal(0.0)); //FIXME DB req column, but this is entered by parent not teacher. 
			respondent.setAddedBy(getCurrentUserName());
			respondent.setUpdtBy(getCurrentUserName());
	    	respondent.setUpdtDt(new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
		try {
			dao.save(respondent);
		} catch (EOLException e) {
			handleError(e, "Exception in Updating Teacher respondent table");
	    }
 		
 		respondentId = respondent.getPrgmGoalsRespondentId();
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