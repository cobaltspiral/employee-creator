package com.cobaltspiral.employee_creator.employee;
import com.cobaltspiral.employee_creator.employee.entity.Employee;

import java.util.List;

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
