package com.HRMSystem.EmployeeManagemnet.Payloads;

import org.springframework.http.HttpStatus;



public class ApiResponse {

	
	private String response="success_info";
	private boolean success=true;
	private HttpStatus status=HttpStatus.ACCEPTED;
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponse(String response, boolean success, HttpStatus status) {
		super();
		this.response = response;
		this.success = success;
		this.status = status;
	}
	
}
