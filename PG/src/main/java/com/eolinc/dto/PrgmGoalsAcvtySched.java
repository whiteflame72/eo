package com.eolinc.dto;

import java.util.Date;

public class PrgmGoalsAcvtySched extends BaseDto {
	private static final long serialVersionUID = 1L;

	private Long respondentId;
	private char asmntId;
	private Date acvtyDt;
	private Long acvtyDetlsId;
	
	public Long getPrgmGoalsAcvtySchedId() {
		return id;
	}
	public void setPrgmGoalsAcvtySchedId(Long id) {
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
	public Date getAcvtyDt() {
		return acvtyDt;
	}
	public void setAcvtyDt(Date acvtyDt) {
		this.acvtyDt = acvtyDt;
	}
	public Long getAcvtyDetlsId() {
		return acvtyDetlsId;
	}
	public void setAcvtyDetlsId(Long acvtyDetlsId) {
		this.acvtyDetlsId = acvtyDetlsId;
	}
	@Override
	public String toString() {
		return "PrgmGoalsAcvtySched [acvtyDetlsId=" + acvtyDetlsId
				+ ", acvtyDt=" + acvtyDt + ", asmntId=" + asmntId
				+ ", respondentId=" + respondentId + "]";
	}
}
