package com.eolinc.dto;

@SuppressWarnings("serial")
public class BaseDto implements java.io.Serializable {

	protected Long id;
	protected BasePrimaryKey pk;

	public Long getId() {
		return id;
	}
	
	public BasePrimaryKey getPk() {
		return pk;
	}

	public boolean equals(BaseDto dto) {
		return dto != null && getId() == dto.getId();
	}
}
