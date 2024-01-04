package com.HRMSystem.EmployeeManagemnet.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HRMSystem.EmployeeManagemnet.entity.EmpPayroll;
import com.HRMSystem.EmployeeManagemnet.entity.Employee;
import com.HRMSystem.EmployeeManagemnet.services.impleEmployeeService.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = null;
		try {

			emp = employeeService.saveEmployee(employee);
			return ResponseEntity.of(Optional.of(emp));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// find by id
	@GetMapping("/find/{id}")
	public EmpPayroll getEmployeeById(@PathVariable int id) {
//		Employee emp = null;
//
//		try {
//			emp = employeeService.getEmployeeById(id);
//			return ResponseEntity.of(Optional.of(emp));
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}

		return employeeService.getEmployeeById(id);

	}

	// find all employee

	@GetMapping("/findAll")
	public ResponseEntity<List<Employee>> employeeAllFindById() {
		List<Employee> emp = null;

		try {
			emp = employeeService.getAllEmployee();
			return ResponseEntity.of(Optional.of(emp));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

	}

}
