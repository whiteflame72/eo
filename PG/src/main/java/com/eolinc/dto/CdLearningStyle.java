package com.eolinc.dto;

public class CdLearningStyle extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String learningStyleName;

	public Long getCdLearningStyleId() {
		return id;
	}
	public void setCdLearningStyleId(Long id) {
		this.id = id;
	}
	public String getLearningStyleName() {
		return learningStyleName;
	}

	public void setLearningStyleName(String learningStyleName) {
		this.learningStyleName = learningStyleName;
	}

	@Override
	public String toString() {
		return "CdLearningStyle [learningStyleName=" + learningStyleName + "]";
	}
}
