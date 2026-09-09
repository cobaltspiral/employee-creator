package com.cobaltspiral.employee_creator.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping ("/employees")
@Tag (name = "Employees", description = "Employees endpoint")
public class EmployeeController {
    
    private final EmployeeService employeeService;
    
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
}
