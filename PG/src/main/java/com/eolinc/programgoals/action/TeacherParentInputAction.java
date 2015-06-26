/*
 * COMPANY NAME: Education OnLine
 * COPYRIGHT                                       
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * PROJECT NAME: Program Goals
 * 
 */

package com.eolinc.programgoals.action;

import java.math.BigDecimal;

import com.eolinc.action.BaseAction;
import com.eolinc.dao.BaseDao;
import com.eolinc.dto.PrgmGoalsAppldKnwlg;
import com.eolinc.dto.PrgmGoalsGradeScale;
import com.eolinc.dto.PrgmGoalsLearningStyle;
import com.eolinc.dto.PrgmGoalsSkillSets;
import com.eolinc.dto.PrgmGoalsWorkHbits;
import com.eolinc.exception.EOLException;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;



public class TeacherParentInputAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	protected BaseDao dao = new BaseDao();

	protected Long studentId = 0L;
	protected Long respondentId = 0L;
	protected String studentFirstName;
	protected String studentLastName;
	protected String parentFirstName;
	protected String parentLastName;
	protected String parentEmail;
	protected Long parentId = 0L;
	protected String teacherFirstName;
	protected String teacherLastName;
	protected String teacherEmail;
	protected Long teacherId = 0L;
	protected String parentFullName;
	protected String studentFullName;
	protected String teacherFullName;
	protected Long subjectId = 1L;
	protected String gradeLevel;
	protected String gradeLevelOther;
	protected int studentsGrade;
	protected float Aplus;
	protected float Aupper;
	protected float Alower;
	protected float Aminusupper;
	protected float Aminuslower;
	protected float Bplusupper;
	protected float Bpluslower;
	protected float Bupper;
	protected float Blower;
	protected float Bminusupper;
	protected float Bminuslower;
	protected float Cplusupper;
	protected float Cpluslower;
	protected float Cupper;
	protected float Clower;
	protected float Cminusupper;
	protected float Cminuslower;
	protected float Dplusupper;
	protected float Dpluslower;
	protected float Dupper;
	protected float Dlower;
	protected float Dminusupper;
	protected float Dminuslower;
	protected float Fupper;
	protected float Flower;
	protected Short anyStyle;
	protected Short realWorldExamples;
	protected Short simplerExplanations;
	protected Short visual;
	protected Short auditory;
	protected Short handson;
	protected Short deductive;
	protected Short inductive;
	protected Short completesAssignments;
	protected Short showsSolution;
	protected Short focus;
	protected Short accuracy;
	protected Short organized;
	protected Short prepared;
	protected Short computationalAccurately=0;
	protected Short calculator=0;
	protected Short retention=0;
	protected Short formulaSelection=0;
	protected Short abstractConcepts=0;
	protected Short logicalThought=0;
	protected Short lowLevelProblem=0;
	protected Short medLevelProblem=0;
	protected Short highLevelProblem=0;
	protected Short singleStepProblem=0;
	protected Short multipleStepProblem=0;
	protected Short realWorldProblems;
	protected Short integratedProblems;
	
    
    public void updateWorkHbitsTable() throws EOLException {
    	//Work Habits Table
    	PrgmGoalsWorkHbits habits = new PrgmGoalsWorkHbits();
    	habits.setPrgmGoalsWorkHbitsId(getRespondentId());
    	habits.setCompletesAssignments(completesAssignments);
    	habits.setShowsSolution(showsSolution);
    	habits.setFocus(focus);
    	habits.setAccuracy(accuracy);
    	habits.setOrganization(organized);
    	habits.setPreparation(prepared);

 		dao.save(habits);
    }
    	
    public void updateLearningStyleTable() throws EOLException {
    	//Learning Style Table
    	PrgmGoalsLearningStyle style = new PrgmGoalsLearningStyle();
    	style.setPrgmGoalsLearningStyleId(getRespondentId());
    	style.setAnyStyle(anyStyle);
    	style.setRealWorldExamples(realWorldExamples);
    	style.setSimplerExplanations(simplerExplanations);
    	style.setVisual(visual);
    	style.setAuditory(auditory);
    	style.setHandsOn(handson);
    	style.setDeductive(deductive);
    	style.setInductive(inductive);
    	
 		dao.save(style);
    }
    	
    public void updateSkillSetsTable() throws EOLException {
    	//Skill Sets Table
    	PrgmGoalsSkillSets skills = new PrgmGoalsSkillSets();
    	skills.setPrgmGoalsSkillSetsId(getRespondentId());
       	skills.setComputationAccuracy(computationalAccurately);
       	skills.setCalculatorUse(calculator);
       	skills.setRetention(retention);
       	skills.setFormulaSelection(formulaSelection);
    	skills.setAbstractConceptGrasp(abstractConcepts);
      	skills.setLogicalThoughtProcess(logicalThought);
      	skills.setLowProblemProficiency(lowLevelProblem);
      	skills.setMedProblemProficiency(medLevelProblem);
      	skills.setHiProblemProficiency(highLevelProblem);
      	skills.setSnglStepProblemSkill(singleStepProblem);
      	skills.setMultStepProblemSkill(multipleStepProblem);

      	dao.save(skills);
    }
      	
    public void updateApplKnwlgTable() throws EOLException {
      	PrgmGoalsAppldKnwlg knowledge = new PrgmGoalsAppldKnwlg();
      	knowledge.setPrgmGoalsAppldKnwlgId(getRespondentId());
      	knowledge.setAppliesKnowledgeRealWorld(realWorldProblems);
      	knowledge.setSolvesIntegratedProblems(integratedProblems);

      	dao.save(knowledge);
   }
      	
    public void updateGradeScaleTables () throws EOLException {
    	//Grading Scale Tables
    	//FIX Probably a better way to do this, some kind of loop like this:
    	/*
      	for (Grades grades : Grades.values()) {
      	  PrgmGoalsGradeScale grade = new PrgmGoalsGradeScale();
      	  grade.setRespondentId(respondentId);
      	  grade.setGradeScaleId(gradeScaleId);
      	  .
      	  .
    	 */


    	// A+
    	PrgmGoalsGradeScale grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(0));
    	grade.setGradeScaleId("A+");
    	grade.setGradeUpperBnd(new BigDecimal(100.0));
    	grade.setGradeLowerBnd(new BigDecimal(Aplus));

    	grade.setRespondentId(respondentId);
    	dao.save(grade);
 
	    	// A
    	grade = new PrgmGoalsGradeScale();
    	//TODO not sure how to get this primary key, hard code to 1
    	grade.setPrgmGoalsGradeScaleId(new Long(1));
    	grade.setGradeScaleId("A");
    	grade.setGradeUpperBnd(new BigDecimal(Aupper));
    	grade.setGradeLowerBnd(new BigDecimal(Alower));

    	grade.setRespondentId(respondentId);
 		dao.save(grade);

    	// A-
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(2));
    	grade.setGradeScaleId("A-");
    	grade.setGradeUpperBnd(new BigDecimal(Aminusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Aminuslower));

    	grade.setRespondentId(respondentId);
  		dao.save(grade);
 
    	// B+
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(3));    	
    	grade.setGradeScaleId("B+");
    	grade.setGradeUpperBnd(new BigDecimal(Bplusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Bpluslower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);

    	// B
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(4));
    	grade.setGradeScaleId("B");
    	grade.setGradeUpperBnd(new BigDecimal(Bupper));
    	grade.setGradeLowerBnd(new BigDecimal(Blower));

    	grade.setRespondentId(respondentId);
 		dao.save(grade);

    	// B-
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(5));    	
    	grade.setGradeScaleId("B-");
    	grade.setGradeUpperBnd(new BigDecimal(Bminusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Bminuslower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);
 
	    	// C+
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(6));
    	grade.setGradeScaleId("C+");
    	grade.setGradeUpperBnd(new BigDecimal(Cplusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Cpluslower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);

    	// C
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(7));    	
    	grade.setGradeScaleId("C");
    	grade.setGradeUpperBnd(new BigDecimal(Cupper));
    	grade.setGradeLowerBnd(new BigDecimal(Clower));

    	grade.setRespondentId(respondentId);
 		dao.save(grade);
 
	    	// C-
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(8));
    	grade.setGradeScaleId("C-");
    	grade.setGradeUpperBnd(new BigDecimal(Cminusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Cminuslower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);

    	// D+
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(9));    	
    	grade.setGradeScaleId("D+");
    	grade.setGradeUpperBnd(new BigDecimal(Dplusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Dpluslower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);

    	// D
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(10));
    	grade.setGradeScaleId("D");
    	grade.setGradeUpperBnd(new BigDecimal(Dupper));
    	grade.setGradeLowerBnd(new BigDecimal(Dlower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);

    	// D-
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(11));
    	grade.setGradeScaleId("D-");
    	grade.setGradeUpperBnd(new BigDecimal(Dminusupper));
    	grade.setGradeLowerBnd(new BigDecimal(Dminuslower));

    	grade.setRespondentId(respondentId);
		dao.save(grade);
 
	    	// F
    	grade = new PrgmGoalsGradeScale();
    	grade.setPrgmGoalsGradeScaleId(new Long(12));    	
    	grade.setGradeScaleId("F");
    	grade.setGradeUpperBnd(new BigDecimal(Fupper));
    	grade.setGradeLowerBnd(new BigDecimal(Flower));

    	grade.setRespondentId(respondentId);
 		dao.save(grade);
    }
   
    public Long getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(Long respondentId) {
        this.respondentId = respondentId;
    }
//	@RequiredStringValidator(trim=true, message="Student First Name is required")
    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }
    
//	@RequiredStringValidator(trim=true, message="Student Last Name is required")
    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
    
    

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
 
//	@RequiredStringValidator(trim=true, message="Parent First Name is required")
    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentfirstname(String parentfirstname) {
        this.parentFirstName = parentfirstname;
    }

//	@RequiredStringValidator(trim=true, message="Parent Last Name is required")
    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }
    

//    @EmailValidator(message="Valid e-mail is required")
    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }
    
   

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

//	@RequiredStringValidator(trim=true, message="Teacher First Name is required")
    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }
    
//	@RequiredStringValidator(trim=true, message="Teacher Last Name is required")
    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherlastname) {
        this.teacherLastName = teacherlastname;
    }
	
//	@FieldExpressionValidator(expression="Aplus > Aupper", message="Grade scale overlap on A+") 
	public float getAplus() {
		return Aplus;
	}

	public void setAplus(float aplus) {
		Aplus = aplus;
	}
	
//	@FieldExpressionValidator(expression="Aupper > Alower", message="Grade scale overlap on A") 
	public float getAupper() {
		return Aupper;
	}

	public void setAupper(float aupper) {
		Aupper = aupper;
	}

//	@FieldExpressionValidator(expression="Alower > Aminusupper", message="Grade scale overlap on A") 
	public float getAlower() {
		return Alower;
	}

	public void setAlower(float alower) {
		Alower = alower;
	}

//	@FieldExpressionValidator(expression="Aminusupper > Aminuslower", message="Grade scale overlap on A-") 
	public float getAminusupper() {
		return Aminusupper;
	}

	public void setAminusupper(float aminusupper) {
		Aminusupper = aminusupper;
	}

//	@FieldExpressionValidator(expression="Aminuslower > Bplusupper", message="Grade scale overlap on A-") 
	public float getAminuslower() {
		return Aminuslower;
	}

	public void setAminuslower(float aminuslower) {
		Aminuslower = aminuslower;
	}

//	@FieldExpressionValidator(expression="Bplusupper > Bpluslower", message="Grade scale overlap on B+") 
	public float getBplusupper() {
		return Bplusupper;
	}

	public void setBplusupper(float bplusupper) {
		Bplusupper = bplusupper;
	}

//	@FieldExpressionValidator(expression="Bpluslower > Bupper", message="Grade scale overlap on B+") 
	public float getBpluslower() {
		return Bpluslower;
	}

	public void setBpluslower(float bpluslower) {
		Bpluslower = bpluslower;
	}

//	@FieldExpressionValidator(expression="Bupper > Blower", message="Grade scale overlap on B") 
	public float getBupper() {
		return Bupper;
	}

	public void setBupper(float bupper) {
		Bupper = bupper;
	}

//	@FieldExpressionValidator(expression="Blower > Bminusupper", message="Grade scale overlap on B") 
	public float getBlower() {
		return Blower;
	}

	public void setBlower(float blower) {
		Blower = blower;
	}

//	@FieldExpressionValidator(expression="Bminusupper > Bminuslower", message="Grade scale overlap on B-") 
	public float getBminusupper() {
		return Bminusupper;
	}

	public void setBminusupper(float bminusupper) {
		Bminusupper = bminusupper;
	}

//	@FieldExpressionValidator(expression="Bminuslower > Cplusupper", message="Grade scale overlap on B-") 
	public float getBminuslower() {
		return Bminuslower;
	}

	public void setBminuslower(float bminuslower) {
		Bminuslower = bminuslower;
	}

//	@FieldExpressionValidator(expression="Cplusupper > Cpluslower", message="Grade scale overlap on C+") 
	public float getCplusupper() {
		return Cplusupper;
	}

	public void setCplusupper(float cplusupper) {
		Cplusupper = cplusupper;
	}

//	@FieldExpressionValidator(expression="Cpluslower > Cupper", message="Grade scale overlap on C+") 
	public float getCpluslower() {
		return Cpluslower;
	}

	public void setCpluslower(float cpluslower) {
		Cpluslower = cpluslower;
	}

//	@FieldExpressionValidator(expression="Cupper > Clower", message="Grade scale overlap on C") 
	public float getCupper() {
		return Cupper;
	}

	public void setCupper(float cupper) {
		Cupper = cupper;
	}

//	@FieldExpressionValidator(expression="Clower > Cminusupper", message="Grade scale overlap on C") 
	public float getClower() {
		return Clower;
	}

	public void setClower(float clower) {
		Clower = clower;
	}

//	@FieldExpressionValidator(expression="Cminusupper > Cminuslower", message="Grade scale overlap on C-") 
	public float getCminusupper() {
		return Cminusupper;
	}

	public void setCminusupper(float cminusupper) {
		Cminusupper = cminusupper;
	}

//	@FieldExpressionValidator(expression="Cminuslower > Dplusupper", message="Grade scale overlap on C-") 
	public float getCminuslower() {
		return Cminuslower;
	}

	public void setCminuslower(float cminuslower) {
		Cminuslower = cminuslower;
	}

//	@FieldExpressionValidator(expression="Dplusupper > Dpluslower", message="Grade scale overlap on D+") 
	public float getDplusupper() {
		return Dplusupper;
	}

	public void setDplusupper(float dplusupper) {
		Dplusupper = dplusupper;
	}
	
//	@FieldExpressionValidator(expression="Dpluslower > Dupper", message="Grade scale overlap on D+") 
	public float getDpluslower() {
		return Dpluslower;
	}
	
	public void setDpluslower(float dpluslower) {
		Dpluslower = dpluslower;
	}
	
//	@FieldExpressionValidator(expression="Dupper > Dlower", message="Grade scale overlap on D") 
	public float getDupper() {
		return Dupper;
	}

	public void setDupper(float dupper) {
		Dupper = dupper;
	}

//	@FieldExpressionValidator(expression="Dlower > Dminusupper", message="Grade scale overlap on D") 
	public float getDlower() {
		return Dlower;
	}

	public void setDlower(float dlower) {
		Dlower = dlower;
	}

//	@FieldExpressionValidator(expression="Dminusupper > Dminuslower", message="Grade scale overlap on D-") 
	public float getDminusupper() {
		return Dminusupper;
	}

	public void setDminusupper(float dminusupper) {
		Dminusupper = dminusupper;
	}

//	@FieldExpressionValidator(expression="Dminuslower > Fupper", message="Grade scale overlap on D-") 
	public float getDminuslower() {
		return Dminuslower;
	}

	public void setDminuslower(float dminuslower) {
		Dminuslower = dminuslower;
	}

//	@FieldExpressionValidator(expression="Fupper > Flower", message="Grade scale overlap on F") 
	public float getFupper() {
		return Fupper;
	}

	public void setFupper(float fupper) {
		Fupper = fupper;
	}

//	@FieldExpressionValidator(expression="Flower > -1", message="Grade scale overlap on F") 
	public float getFlower() {
		return Flower;
	}
	
	public void setFlower(float flower) {
		Flower = flower;
	}	

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public String getGradeLevelOther() {
		return gradeLevelOther;
	}

	public void setGradeLevelOther(String gradeLevelOther) {
		this.gradeLevelOther = gradeLevelOther;
	}

	public int getStudentsGrade() {
		return studentsGrade;
	}

	public void setStudentsGrade(int studentsGrade) {
		this.studentsGrade = studentsGrade;
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

	public Short getHandson() {
		return handson;
	}

	public void setHandson(Short handson) {
		this.handson = handson;
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

	public Short getOrganized() {
		return organized;
	}

	public void setOrganized(Short organized) {
		this.organized = organized;
	}

	public Short getPrepared() {
		return prepared;
	}

	public void setPrepared(Short prepared) {
		this.prepared = prepared;
	}

	public Short getComputationalAccurately() {
		return computationalAccurately;
	}

	public void setComputationalAccurately(Short computationalAccurately) {
		this.computationalAccurately = computationalAccurately;
	}

	public Short getCalculator() {
		return calculator;
	}

	public void setCalculator(Short calculator) {
		this.calculator = calculator;
	}

	public Short getRetention() {
		return retention;
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

	public Short getAbstractConcepts() {
		return abstractConcepts;
	}

	public void setAbstractConcepts(Short abstractConcepts) {
		this.abstractConcepts = abstractConcepts;
	}

	public Short getLogicalThought() {
		return logicalThought;
	}

	public void setLogicalThought(Short logicalThought) {
		this.logicalThought = logicalThought;
	}

	public Short getLowLevelProblem() {
		return lowLevelProblem;
	}

	public void setLowLevelProblem(Short lowLevelProblem) {
		this.lowLevelProblem = lowLevelProblem;
	}

	public Short getMedLevelProblem() {
		return medLevelProblem;
	}

	public void setMedLevelProblem(Short medLevelProblem) {
		this.medLevelProblem = medLevelProblem;
	}

	public Short getHighLevelProblem() {
		return highLevelProblem;
	}

	public void setHighLevelProblem(Short highLevelProblem) {
		this.highLevelProblem = highLevelProblem;
	}

	public Short getSingleStepProblem() {
		return singleStepProblem;
	}

	public void setSingleStepProblem(Short singleStepProblem) {
		this.singleStepProblem = singleStepProblem;
	}

	public Short getMultipleStepProblem() {
		return multipleStepProblem;
	}

	public void setMultipleStepProblem(Short multipleStepProblem) {
		this.multipleStepProblem = multipleStepProblem;
	}

	public Short getRealWorldProblems() {
		return realWorldProblems;
	}

	public void setRealWorldProblems(Short realWorldProblems) {
		this.realWorldProblems = realWorldProblems;
	}

	public Short getIntegratedProblems() {
		return integratedProblems;
	}

	public void setIntegratedProblems(Short integratedProblems) {
		this.integratedProblems = integratedProblems;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentFullName() {
		return parentFullName;
	}

	public void setParentFullName(String parentFullName) {
		this.parentFullName = parentFullName;
	}

	public String getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}

	public String getTeacherFullName() {
		return teacherFullName;
	}

	public void setTeacherFullName(String teacherFullName) {
		this.teacherFullName = teacherFullName;
	}

	

}
