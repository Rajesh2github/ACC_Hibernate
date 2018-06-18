package com.boot.demo.exception;

public class UserException {

	private String exceptionId;
	private String errorMessage;
	public String getExceptionId() {
		return exceptionId;
	}
	public void setExceptionId(String exceptionId) {
		this.exceptionId = exceptionId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "UserException [exceptionId=" + exceptionId + ", errorMessage="
				+ errorMessage + "]";
	}
	
}
