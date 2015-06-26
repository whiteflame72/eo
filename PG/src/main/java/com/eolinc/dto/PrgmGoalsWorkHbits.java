package com.eolinc.dto;


public class PrgmGoalsWorkHbits extends BaseDto {
	private static final long serialVersionUID = 1L;

	public Short completesAssignments;
    public Short showsSolution;
    public Short focus;
    public Short accuracy;
    public Short organization;
    public Short preparation;
    
	public Long getPrgmGoalsWorkHbitsId() {
		return id;
	}
	public void setPrgmGoalsWorkHbitsId(Long id) {
		this.id = id;
	}
	public Short getCompletesAssignments() {
		return completesAssignments;
	}
	public void setCompletesAssignments(Short completesAssignments) {
		this.completesAssignments = completesAssignments;
	}
	public Short getShowsSolution() {
		return showsSolution;
	}
	public void setShowsSolution(Short showsSolution) {
		this.showsSolution = showsSolution;
	}
	public Short getFocus() {
		return focus;
	}
	public void setFocus(Short focus) {
		this.focus = focus;
	}
	public Short getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Short accuracy) {
		this.accuracy = accuracy;
	}
	public Short getOrganization() {
		return organization;
	}
	public void setOrganization(Short organization) {
		this.organization = organization;
	}
	public Short getPreparation() {
		return preparation;
	}
	public void setPreparation(Short preparation) {
		this.preparation = preparation;
	}
	@Override
	public String toString() {
		return "PrgmGoalsWorkHbits [accuracy=" + accuracy
				+ ", completesAssignments=" + completesAssignments + ", focus="
				+ focus + ", organization=" + organization + ", preparation="
				+ preparation + ", showsSolution=" + showsSolution + "]";
	}
}