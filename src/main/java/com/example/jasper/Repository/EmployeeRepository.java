package com.example.jasper.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jasper.Enity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
