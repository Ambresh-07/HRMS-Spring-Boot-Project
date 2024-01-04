package com.MRMSystem.PayrollManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MRMSystem.PayrollManagement.entitys.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Integer> {

	public List<Payroll> findByEmpid(int empid);

}
