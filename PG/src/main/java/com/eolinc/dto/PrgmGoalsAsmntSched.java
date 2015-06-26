package com.eolinc.dto;

import java.util.Date;

public class PrgmGoalsAsmntSched extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long respondentId;
	private char asmntId;
	private Date asmntDt;
	private Long asmntDetlsId;

	public Long getPrgmGoalsAsmntSchedId() {
		return id;
	}
	public void setPrgmGoalsAsmntSchedId(Long id) {
		this.id = id;
	}
	public Long getRespondentId() {
		return respondentId;
	}
	public void setRespondentId(Long respondentId) {
		this.respondentId = respondentId;
	}
	public char getAsmntId() {
		return asmntId;
	}
	public void setAsmntId(char asmntId) {
		this.asmntId = asmntId;
	}
	public Date getAsmntDt() {
		return asmntDt;
	}
	public void setAsmntDt(Date asmntDt) {
		this.asmntDt = asmntDt;
	}
	public Long getAsmntDetlsId() {
		return asmntDetlsId;
	}
	public void setAsmntDetlsId(Long asmntDetlsId) {
		this.asmntDetlsId = asmntDetlsId;
	}
	@Override
	public String toString() {
		return "PrgmGoalsAsmntSched [asmntDetlsId=" + asmntDetlsId
				+ ", asmntDt=" + asmntDt + ", asmntId=" + asmntId
				+ ", respondentId=" + respondentId + "]";
	}
}
