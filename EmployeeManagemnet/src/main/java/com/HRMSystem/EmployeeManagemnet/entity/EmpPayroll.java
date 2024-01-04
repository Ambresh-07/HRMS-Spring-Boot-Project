package com.HRMSystem.EmployeeManagemnet.entity;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class EmpPayroll {
	private Employee employee;
	private ArrayList<Payroll> payroll;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public ArrayList<Payroll> getPayroll() {
		return payroll;
	}
	public void setPayroll(ArrayList<Payroll> payroll) {
		this.payroll = payroll;
	}
	public EmpPayroll(Employee employee, ArrayList<Payroll> payroll) {
		super();
		this.employee = employee;
		this.payroll = payroll;
	}
	public EmpPayroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
