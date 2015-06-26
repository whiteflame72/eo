package com.eolinc.dto;

public class CdLearningObjective extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String name;
	private Long topicId;

	public Long getCdLearningObjectiveId() {
		return id;
	}
	public void setCdLearningObjectiveId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	@Override
	public String toString() {
		return "CdLearningObjective [name=" + name + ", topicId=" + topicId + "]";
	}
}
