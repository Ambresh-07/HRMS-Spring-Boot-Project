package com.HRMSystem.EmployeeManagemnet.Exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super("resource not found on this server...");
	}
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	

}
