package com.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String FieldName;
	private Object FieldValue;
	
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFieldName() {
		return FieldName;
	}
	
	public Object getFieldValue() {
		return FieldValue;
	}
	
	public ResourceNotFoundException(String resourceName, String FieldName, Object FieldValue) {
		super(String.format("%s is not found with the %s",resourceName,FieldName,FieldValue));
		this.resourceName= resourceName;
		this.FieldName= FieldName;
		this.FieldValue= FieldValue;
	}

}
