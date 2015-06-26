package com.eolinc.dto;

@SuppressWarnings("serial")
public class RecommendedActivitiesDTO extends BaseDto{
	
	private String assessment;
	private String homework;
	private String tutoring;
	private String schedule;
	
	public RecommendedActivitiesDTO(){
		
	}

	public String getMonthlyAssessment() {
		return assessment;
	}

	public void setMonthlyAssessment(String assessment) {
		this.assessment = assessment;
	}

	public String getHomeworkHelp() {
		return homework;
	}

	public void setHomeworkHelp(String homework) {
		this.homework = homework;
	}

	public String getTutoring() {
		return tutoring;
	}

	public void setTutoring(String tutoring) {
		this.tutoring = tutoring;
	}

	public String getTutoringSchedule() {
		return schedule;
	}

	public void setTutoringSchedule(String schedule) {
		this.schedule = schedule;
	}	
}
