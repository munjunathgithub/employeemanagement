package com.emp.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
