package com.eolinc.dto;

public class PrgmGoalsLearningStyle extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Short anyStyle;
	private Short realWorldExamples;
	private Short simplerExplanations;
	private Short visual;
	private Short auditory;
	private Short handsOn;
	private Short deductive;
	private Short inductive;

	public Long getPrgmGoalsLearningStyleId() {
		return id;
	}
	public void setPrgmGoalsLearningStyleId(Long id) {
		this.id = id;
	}
	public Short getAnyStyle() {
		return anyStyle;
	}
	public void setAnyStyle(Short anyStyle) {
		this.anyStyle = anyStyle;
	}
	public Short getRealWorldExamples() {
		return realWorldExamples;
	}
	public void setRealWorldExamples(Short realWorldExamples) {
		this.realWorldExamples = realWorldExamples;
	}
	public Short getSimplerExplanations() {
		return simplerExplanations;
	}
	public void setSimplerExplanations(Short simplerExplanations) {
		this.simplerExplanations = simplerExplanations;
	}
	public Short getVisual() {
		return visual;
	}
	public void setVisual(Short visual) {
		this.visual = visual;
	}
	public Short getAuditory() {
		return auditory;
	}
	public void setAuditory(Short auditory) {
		this.auditory = auditory;
	}
	public Short getHandsOn() {
		return handsOn;
	}
	public void setHandsOn(Short handsOn) {
		this.handsOn = handsOn;
	}
	public Short getDeductive() {
		return deductive;
	}
	public void setDeductive(Short deductive) {
		this.deductive = deductive;
	}
	public Short getInductive() {
		return inductive;
	}
	public void setInductive(Short inductive) {
		this.inductive = inductive;
	}
	@Override
	public String toString() {
		return "PrgmGoalsLearningStyl [anyStyle=" + anyStyle + ", auditory="
				+ auditory + ", deductive=" + deductive + ", handsOn="
				+ handsOn + ", inductive=" + inductive + ", realWorldExamples="
				+ realWorldExamples + ", simplerExplanations="
				+ simplerExplanations + ", visual=" + visual + "]";
	}
}