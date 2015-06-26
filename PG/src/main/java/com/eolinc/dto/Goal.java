package com.eolinc.dto;

public class Goal extends BaseDto {
	private static final long serialVersionUID = 1L;
 
	private Long studentId;
	private Long topicId;
	private Long goal;
	
	public Long getGoalId() {
		return id;
	}
	public void setGoalId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	public Long getGoal() {
		return goal;
	}
	public void setGoal(Long goal) {
		this.goal = goal;
	}
	@Override
	public String toString() {
		return "Goal [goal=" + goal + ", studentId=" + studentId + ", topicId="
				+ topicId + "]";
	}
}
