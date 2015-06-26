package com.eolinc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class StudentLearningStylePK implements Serializable, BasePrimaryKey {

	private Long studentId;
	private Long learningStyleId;

    @Column(name="STUDENT_ID")
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
    @Column(name="LRNG_STYLE_ID")
	public Long getLearningStyleId() {
		return learningStyleId;
	}
	public void setLearningStyleId(Long learningStyleId) {
		this.learningStyleId = learningStyleId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((learningStyleId == null) ? 0 : learningStyleId.hashCode());
		result = prime * result
				+ ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentLearningStylePK other = (StudentLearningStylePK) obj;
		if (learningStyleId == null) {
			if (other.learningStyleId != null)
				return false;
		} else if (!learningStyleId.equals(other.learningStyleId))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

}
