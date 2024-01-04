package com.HRMSystem.EmployeeManagemnet.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String email;
	private Long contact;

//	payroll get form another web service
	@Transient
	private ArrayList<Payroll> payroll = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public List<Payroll> getPayroll() {
		return payroll;
	}

	public void setPayroll(ArrayList<Payroll> payroll) {
		this.payroll = payroll;
	}

	public Employee(int id, String name, String email, Long contact, ArrayList<Payroll> payroll) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.payroll = payroll;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
