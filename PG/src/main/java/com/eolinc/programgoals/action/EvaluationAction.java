package com.eolinc.programgoals.action;

import com.eolinc.dto.PrgmGoalsParentTrgt;
import com.eolinc.dto.PrgmGoalsPrgmSched;
import com.eolinc.dto.PrgmGoalsRespondent;
import com.eolinc.dto.PrgmGoalsSkillSets;
import com.eolinc.dto.PrgmGoalsWorkHbits;
import com.opensymphony.xwork2.ActionSupport;

public class EvaluationAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private final String CONST_REGULAR = "R";
	private final String CONST_INTENSE = "I";
	
	private PrgmGoalsRespondent respondent = null;
	private PrgmGoalsWorkHbits habits = null;
	private PrgmGoalsParentTrgt target = null;
	private PrgmGoalsSkillSets skills = null;
	private PrgmGoalsPrgmSched schedule = null;
	
	//TODO: services to get:
	//1.parent input
	//2.learning style/habit
	//3.teacher input
	//4.college requirements
	//5.assessment test results
	
	private String currentGrade;
	private String assessmentGrade;
	private String desiredGrade;
	private String collageReq;
	
	
	public void gapAnalysis() {
		schedule = new PrgmGoalsPrgmSched();
		
		int currentGradeInt = Integer.parseInt(currentGrade);
		int assessmentGradeInt = Integer.parseInt(assessmentGrade);
		int desiredGradeInt = Integer.parseInt(desiredGrade);
		int collageReqInt = Integer.parseInt(collageReq);
		
		if (currentGradeInt < desiredGradeInt || assessmentGradeInt < desiredGradeInt) {
			if ( (desiredGradeInt - currentGradeInt) > 2 || 
					(desiredGradeInt - assessmentGradeInt) > 2) {
				//need intensive tutoring
				schedule.setSchedLevel(CONST_REGULAR);
			} else {
				if ((collageReqInt - currentGradeInt) > 2 || 
						(collageReqInt - assessmentGradeInt) > 2) {
					//need intensive tutoring
					schedule.setSchedLevel(CONST_INTENSE);
				} else {
					//need regular tutoring
					schedule.setSchedLevel(CONST_REGULAR);
				}
			}
		} else {
			if (collageReqInt > currentGradeInt || collageReqInt > assessmentGradeInt) {
				if ((collageReqInt - currentGradeInt) > 2 || 
						(collageReqInt - assessmentGradeInt) > 2) {
					//need intensive tutoring
					schedule.setSchedLevel(CONST_INTENSE);
				} else {
					//need regular tutoring
					schedule.setSchedLevel(CONST_REGULAR);
				}
			} else {
				//no tutoring needed
			}
		}
	}
}