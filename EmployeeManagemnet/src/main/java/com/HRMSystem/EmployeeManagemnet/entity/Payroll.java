package com.HRMSystem.EmployeeManagemnet.entity;

import org.springframework.stereotype.Component;

public class Payroll {
	private int p_id;
	private int empid;
	private double tds;
	private double pf;
	private double inHandSalary;
	private double grossSalary;
	private double totalDeduction;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getTds() {
		return tds;
	}

	public void setTds(double tds) {
		this.tds = tds;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getInHandSalary() {
		return inHandSalary;
	}

	public void setInHandSalary(double inHandSalary) {
		this.inHandSalary = inHandSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public Payroll(int p_id, int empid, double tds, double pf, double inHandSalary, double grossSalary,
			double totalDeduction) {
		super();
		this.p_id = p_id;
		this.empid = empid;
		this.tds = tds;
		this.pf = pf;
		this.inHandSalary = inHandSalary;
		this.grossSalary = grossSalary;
		this.totalDeduction = totalDeduction;
	}

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

}
