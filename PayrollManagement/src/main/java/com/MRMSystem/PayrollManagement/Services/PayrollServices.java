package com.MRMSystem.PayrollManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.MRMSystem.PayrollManagement.entitys.Payroll;
import com.MRMSystem.PayrollManagement.repository.PayrollRepository;

@Service
public class PayrollServices {

	@Autowired
	PayrollRepository payrollRepository;

	// save payroll
	public Payroll savePayroll(Payroll payroll) {

		double totaldeduct = totalSalaryDeduction(payroll.getGrossSalary(),payroll.getTds(), payroll.getPf() );

		System.out.println("total deductin salary is : " + totaldeduct);

		double inHandSal = inhandSalary(totaldeduct, payroll.getGrossSalary());
//		
		payroll.setTotalDeduction(totaldeduct);
//
		payroll.setInHandSalary(inHandSal);
//
//		System.out.println("inhand payroll salary : " + inHandSal);

		return payrollRepository.save(payroll);

	}

	private double totalSalaryDeduction( double grossSalary,double tds, double pf) {
		
		return tds+pf;
	}



	// inhand salary
	static double inhandSalary(double totaldeduct, double grossSalary) {
		return grossSalary - totaldeduct;

	}

	// get payroll by id
	public Optional<Payroll> findById(int id) {
		return payrollRepository.findById(id);

	}

	// get all
	public List<Payroll> findAll() {
		return payrollRepository.findAll();

	}

	// find by payrolls by emp_id

	public List<Payroll> findEmpById(int empid) {
		return payrollRepository.findByEmpid(empid);

	}

}
