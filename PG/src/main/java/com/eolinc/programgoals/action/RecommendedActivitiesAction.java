package com.eolinc.programgoals.action;

import java.util.Date;

import com.eolinc.action.BaseAction;
import com.eolinc.dao.BaseDao;
import com.eolinc.dto.PrgmGoalsAcvtySched;
import com.eolinc.dto.Profile;
import com.eolinc.dto.RecommendedActivitiesDTO;
import com.eolinc.exception.EOLException;
import com.eolinc.utility.HibernateUtil;

public class RecommendedActivitiesAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BaseDao dao = new BaseDao();
	
	RecommendedActivitiesDTO activities = new RecommendedActivitiesDTO();
	
	private Profile parent;
	private Profile student;
	private Profile teacher;
	private Long parentID;
	private Long studentID;
	
	//need to confirm if the topic id is the same as subject id
	private Long subjectID;
	private float targetGpa;

	public Long getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(Long subjectID) {
		this.subjectID = subjectID;
	}

	public String execute(){
		logger.info("Entering recommended Activities Action:execute");
		try{
			parent = (Profile) session.get("User");
	    	if (parent == null) 
	    		return ERROR;
	    	parentID = parent.getProfileId();
	    	//assuming student id is in the session. student dao should be a list
	    	studentID = student.getProfileId();//need to change the getter	
	    	
	    	setRecommendedActivities();
		}catch(EOLException eolException){
			handleError(eolException, "Error processing students info.");
		}catch(Exception exception){
			
		}
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public void setRecommendedActivities()throws EOLException{
		
		HibernateUtil utils = new HibernateUtil();
		
		String maxQuery = "select max(timestamp) from Score s where s.studentId=? and s.topicId=?";
		String scoreQuery = "select s.score from Score s where s.studentId=? and s.topicId=?  and s.timestamp=?";
		
		String maxParams[] = new String[]{studentID.toString(),getSubjectID().toString()};		
		Date maxDate = (Date)utils.findMax(maxQuery, maxParams).get(0);
		
		Object[] values = new Object[]{studentID,getSubjectID(),maxDate};
		Long score = (Long)utils.findRecord(scoreQuery, values).get(0);
		
		calcGoals(score);
	}
	
	private void calcGoals(float default_score) throws EOLException{
		
		float desiredGrade = getTargetGpa();
    	long actSchedId = 1;
    	long acvtyDetlsId = 1;
    	Date today = new Date();
    	float current_score  = default_score;
    	
    	if (desiredGrade-current_score < 0) {
    		logger.info("Optional Tutoring is required");
    		acvtyDetlsId = 1;	//Optional Tutoring
    		activities.setTutoring("Optional");
    	} else if ((desiredGrade-current_score <= 20) && (desiredGrade-current_score >= 0)) {
    		logger.info("Regular Tutoring is required");
    		acvtyDetlsId = 2;	//Regular Tutoring
    		activities.setTutoring("Regular");
			activities.setTutoringSchedule("Two half hour sessions per week");
    	} else if ((desiredGrade-current_score > 20)) {
    		logger.info("Intense Tutoring is required");
    		acvtyDetlsId = 3;	//Intense Tutoring
    		activities.setTutoring("Intense");
			activities.setTutoringSchedule("Four one hour sessions per week");
    	}
    	
    	PrgmGoalsAcvtySched activity = new PrgmGoalsAcvtySched();
    	char Tutoring = 'T';
    	//activity.setRespondentId(respondentId);
    	activity.setRespondentId(studentID);	//for demo only
    	activity.setAsmntId(Tutoring);
    	activity.setPrgmGoalsAcvtySchedId(actSchedId);
    	activity.setAcvtyDetlsId(acvtyDetlsId);
    	activity.setAcvtyDt(today);
    	
    	dao.save(activity);
	}
	
	public float getTargetGpa() {
		return targetGpa;
	}
	public void setTargetGpa(float targetGpa) {
		this.targetGpa = targetGpa;
	}
}
