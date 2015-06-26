package com.eolinc.dto;


public class PrgmGoalsSkillSets extends BaseDto {
	private static final long serialVersionUID = 1L;

	public Short computationAccuracy;
	public Short calculatorUse;
	public Short retention;
	public Short formulaSelection;
	public Short abstractConceptGrasp;
	public Short logicalThoughtProcess;
	public Short lowProblemProficiency;
	public Short medProblemProficiency;
	public Short hiProblemProficiency;
	public Short snglStepProblemSkill;
	public Short multStepProblemSkill;
	
	public Long getPrgmGoalsSkillSetsId() {
		return id;
	}
	public void setPrgmGoalsSkillSetsId(Long id) {
		this.id = id;
	}
	public Short getComputationAccuracy() {
		return computationAccuracy;
	}
	public void setComputationAccuracy(Short computationAccuracy) {
		this.computationAccuracy = computationAccuracy;
	}
	public Short getCalculatorUse() {
		return calculatorUse;
	}
	public void setCalculatorUse(Short calculatorUse) {
		this.calculatorUse = calculatorUse;
	}
	public Short getRetention() {
		return retention;
	}
	public Short getMultStepProblemSkill() {
		return multStepProblemSkill;
	}
	public void setMultStepProblemSkill(Short multStepProblemSkill) {
		this.multStepProblemSkill = multStepProblemSkill;
	}
	public void setRetention(Short retention) {
		this.retention = retention;
	}
	public Short getFormulaSelection() {
		return formulaSelection;
	}
	public void setFormulaSelection(Short formulaSelection) {
		this.formulaSelection = formulaSelection;
	}
	public Short getAbstractConceptGrasp() {
		return abstractConceptGrasp;
	}
	public void setAbstractConceptGrasp(Short abstractConceptGrasp) {
		this.abstractConceptGrasp = abstractConceptGrasp;
	}
	public Short getLogicalThoughtProcess() {
		return logicalThoughtProcess;
	}
	public void setLogicalThoughtProcess(Short logicalThoughtProcess) {
		this.logicalThoughtProcess = logicalThoughtProcess;
	}
	public Short getLowProblemProficiency() {
		return lowProblemProficiency;
	}
	public void setLowProblemProficiency(Short lowProblemProficiency) {
		this.lowProblemProficiency = lowProblemProficiency;
	}
	public Short getMedProblemProficiency() {
		return medProblemProficiency;
	}
	public void setMedProblemProficiency(Short medProblemProficiency) {
		this.medProblemProficiency = medProblemProficiency;
	}
	public Short getHiProblemProficiency() {
		return hiProblemProficiency;
	}
	public void setHiProblemProficiency(Short hiProblemProficiency) {
		this.hiProblemProficiency = hiProblemProficiency;
	}
	public Short getSnglStepProblemSkill() {
		return snglStepProblemSkill;
	}
	public void setSnglStepProblemSkill(Short snglStepProblemSkill) {
		this.snglStepProblemSkill = snglStepProblemSkill;
	}
	@Override
	public String toString() {
		return "PrgmGoalsSkillSets [abstractConceptGrasp="
				+ abstractConceptGrasp + ", calculatorUse=" + calculatorUse
				+ ", computationAccuracy=" + computationAccuracy
				+ ", formulaSelection=" + formulaSelection
				+ ", hiProblemProficiency=" + hiProblemProficiency
				+ ", logicalThoughtProcess=" + logicalThoughtProcess
				+ ", lowProblemProficiency=" + lowProblemProficiency
				+ ", medProblemProficiency=" + medProblemProficiency
				+ ", multStepProblemSkill=" + multStepProblemSkill
				+ ", retention=" + retention + ", snglStepProblemSkill="
				+ snglStepProblemSkill + "]";
	}
}