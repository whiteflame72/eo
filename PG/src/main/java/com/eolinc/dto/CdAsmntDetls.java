package com.eolinc.dto;

public class CdAsmntDetls extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String asmntDetlsName;

	public Long getCdAsmntDetlsId() {
		return id;
	}
	public void setCdAsmntDetlsId(Long id) {
		this.id = id;
	}
	public String getAsmntDetlsName() {
		return asmntDetlsName;
	}

	public void setAsmntDetlsName(String asmntDetlsName) {
		this.asmntDetlsName = asmntDetlsName;
	}

	@Override
	public String toString() {
		return "CdAsmntDetls [asmntDetlsName=" + asmntDetlsName + "]";
	}
}
