package com.cobaltspiral.employee_creator.employee;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobaltspiral.employee_creator.employee.DTOs.EmployeeResponseDTO;
import com.cobaltspiral.employee_creator.employee.entity.Employee;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping ("/employees")
@Tag (name = "Employees", description = "Employees endpoint")
public class EmployeeController {
    
    private final EmployeeService employeeService;
    
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> getAllEmployees () {
        List<Employee> all = this.employeeService.getAll();
        return ResponseEntity.ok(EmployeeResponseDTO.fromEntity(all));
    }
    
    public static List<EmployeeResponseDTO> fromEntity(List<Employee> employeeList) {
        return employeeList.stream()
            .map(employee -> EmployeeResponseDTO.fromEntity(employee))
            .toList();
    }
}
