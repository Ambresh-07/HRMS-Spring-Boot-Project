package com.HRMSystem.EmployeeManagemnet.repositoryies;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HRMSystem.EmployeeManagemnet.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
