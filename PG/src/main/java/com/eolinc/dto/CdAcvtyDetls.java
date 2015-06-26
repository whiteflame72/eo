package com.eolinc.dto;

public class CdAcvtyDetls extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String acvtyDetlsName;

	public Long getCdAcvtyDetlsId() {
		return id;
	}
	public void setCdAcvtyDetlsId(Long id) {
		this.id = id;
	}
	public String getAcvtyDetlsName() {
		return acvtyDetlsName;
	}

	public void setAcvtyDetlsName(String acvtyDetlsName) {
		this.acvtyDetlsName = acvtyDetlsName;
	}

	@Override
	public String toString() {
		return "CdAcvtyDetls [acvtyDetlsName=" + acvtyDetlsName + "]";
	}
}
