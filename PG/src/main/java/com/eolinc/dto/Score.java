package com.eolinc.dto;

import java.util.Date;

public class Score extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long studentId;
	private Long topicId;
	private Long score;
	private Date timestamp;
	
	public Long getScoreId() {
		return id;
	}
	public void setScoreId(Long id) {
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
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Score [score=" + score + ", studentId=" + studentId
				+ ", timestamp=" + timestamp + ", topicId=" + topicId + "]";
	}


}
