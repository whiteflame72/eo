package com.eolinc.dto;

public class CdTopic extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String topicName;
	private Long subjectId;

	public Long getCdTopicId() {
		return id;
	}
	public void setCdTopicId(Long id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	@Override
	public String toString() {
		return "CdTopic [subjectId=" + subjectId + ", topicName=" + topicName
				+ "]";
	}
}
