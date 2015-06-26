package com.eolinc.dto;

public class CdActy extends BaseDto {
	private static final long serialVersionUID = 1L;

	private String actyName;

	public Long getCdActyId() {
		return id;
	}
	public void setCdActyId(Long id) {
		this.id = id;
	}
	public String getActyName() {
		return actyName;
	}

	public void setActyName(String actyName) {
		this.actyName = actyName;
	}

	@Override
	public String toString() {
		return "CdActy [actyName=" + actyName + "]";
	}
}
