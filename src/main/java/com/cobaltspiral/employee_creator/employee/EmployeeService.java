package com.cobaltspiral.employee_creator.employee;

import org.springframework.stereotype.Service;

@Service 
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }

}
