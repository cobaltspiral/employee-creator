package com.cobaltspiral.employee_creator.employee;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cobaltspiral.employee_creator.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @EntityGraph (attributePaths = "address")
    List<Employee> findAll();
}
