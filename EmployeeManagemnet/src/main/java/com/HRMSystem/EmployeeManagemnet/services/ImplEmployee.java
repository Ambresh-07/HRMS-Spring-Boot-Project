package com.HRMSystem.EmployeeManagemnet.services;

import java.util.List;

import com.HRMSystem.EmployeeManagemnet.entity.EmpPayroll;
import com.HRMSystem.EmployeeManagemnet.entity.Employee;

public interface ImplEmployee {

//	save employee
	public Employee saveEmployee(Employee employee);

//	getEmployee by id

	public EmpPayroll getEmployeeById(int id);

//	get all employee
	public List<Employee> getAllEmployee();

}
