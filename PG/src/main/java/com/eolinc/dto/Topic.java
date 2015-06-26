package com.eolinc.dto;

public class Topic extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private Long subjectId;
	
	public Long getTopicId() {
		return id;
	}
	public void setTopicId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	@Override
	public String toString() {
		return "Topic [description=" + description + ", name=" + name
				+ ", subjectId=" + subjectId + "]";
	}

}
