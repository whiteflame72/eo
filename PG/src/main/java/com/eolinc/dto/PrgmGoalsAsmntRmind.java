package com.eolinc.dto;


public class PrgmGoalsAsmntRmind extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String asmntId;
    private String rmindType;
    private String rmindEmailId;
    
	public Long getPrgmGoalsAsmntRmindId() {
		return id;
	}
	public void setPrgmGoalsAsmntRmindId(Long id) {
		this.id = id;
	}
	public String getAsmntId() {
		return asmntId;
	}
	public void setAsmntId(String asmntId) {
		this.asmntId = asmntId;
	}
	public String getRmindType() {
		return rmindType;
	}
	public void setRmindType(String rmindType) {
		this.rmindType = rmindType;
	}
	public String getRmindEmailId() {
		return rmindEmailId;
	}
	public void setRmindEmailId(String rmindEmailId) {
		this.rmindEmailId = rmindEmailId;
	}
	@Override
	public String toString() {
		return "PrgmGoalsAsmntRmind [asmntId=" + asmntId + ", rmindEmailId="
				+ rmindEmailId + ", rmindType=" + rmindType + "]";
	}
}