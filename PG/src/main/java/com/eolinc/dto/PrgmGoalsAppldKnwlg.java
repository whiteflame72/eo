package com.eolinc.dto;

public class PrgmGoalsAppldKnwlg extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Short appliesKnowledgeRealWorld;
	private Short solvesIntegratedProblems;
	
	public Long getPrgmGoalsAppldKnwlgId() {
		return id;
	}
	public void setPrgmGoalsAppldKnwlgId(Long id) {
		this.id = id;
	}
	public Short getAppliesKnowledgeRealWorld() {
		return appliesKnowledgeRealWorld;
	}
	public void setAppliesKnowledgeRealWorld(Short appliesKnowledgeRealWorld) {
		this.appliesKnowledgeRealWorld = appliesKnowledgeRealWorld;
	}
	public Short getSolvesIntegratedProblems() {
		return solvesIntegratedProblems;
	}
	public void setSolvesIntegratedProblems(Short solvesIntegratedProblems) {
		this.solvesIntegratedProblems = solvesIntegratedProblems;
	}
	@Override
	public String toString() {
		return "PrgmGoalsAppldKnwlg [appliesKnowledgeRealWorld="
				+ appliesKnowledgeRealWorld + ", solvesIntegratedProblems="
				+ solvesIntegratedProblems + "]";
	}
}