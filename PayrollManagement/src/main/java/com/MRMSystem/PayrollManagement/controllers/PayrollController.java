package com.MRMSystem.PayrollManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MRMSystem.PayrollManagement.Services.PayrollServices;
import com.MRMSystem.PayrollManagement.entitys.Payroll;

@RestController
@RequestMapping("/Payroll")
public class PayrollController {

	@Autowired
	PayrollServices payrollServices;

//save payroll
	@PostMapping("/save")
	public Payroll savePayroll(@RequestBody Payroll payroll) {
		return payrollServices.savePayroll(payroll);

	}

	// findby id
	@GetMapping("/find/{id}")
	public Optional<Payroll> findPayrollById(@PathVariable int id) {
		return payrollServices.findById(id);

	}

	// find all
	@GetMapping("/findAll/")
	public List<Payroll> findAll() {
		return payrollServices.findAll();
	}

	// find payrolls by emp_id

	@GetMapping("/Pemp/{empid}")
	public List<Payroll> findPayrollByEmp_id(@PathVariable int empid) {
		return payrollServices.findEmpById(empid);

	}

}
