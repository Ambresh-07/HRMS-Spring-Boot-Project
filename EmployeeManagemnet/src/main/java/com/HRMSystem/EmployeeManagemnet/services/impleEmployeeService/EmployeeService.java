package com.HRMSystem.EmployeeManagemnet.services.impleEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.HRMSystem.EmployeeManagemnet.Exception.ResourceNotFoundException;
import com.HRMSystem.EmployeeManagemnet.entity.EmpPayroll;
import com.HRMSystem.EmployeeManagemnet.entity.Employee;
import com.HRMSystem.EmployeeManagemnet.entity.Payroll;
import com.HRMSystem.EmployeeManagemnet.repositoryies.EmployeeRepository;
import com.HRMSystem.EmployeeManagemnet.services.ImplEmployee;

@Service
public class EmployeeService implements ImplEmployee {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	RestTemplate restTemplate;

	private org.slf4j.Logger loggre = LoggerFactory.getLogger(EmployeeService.class);

	// save single employee
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public EmpPayroll getEmployeeById(int id) {
		Employee opEmp = employeeRepository.findById(id).get();

		EmpPayroll emps = new EmpPayroll();

		ArrayList<Payroll> apyrol = restTemplate.getForObject("http://localhost:8082/Payroll/Pemp/"+id,
				ArrayList.class);

		emps.setEmployee(opEmp);
		emps.setPayroll(apyrol);
		return emps;

	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
