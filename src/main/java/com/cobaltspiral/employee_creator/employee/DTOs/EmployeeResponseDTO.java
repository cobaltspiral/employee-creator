package com.cobaltspiral.employee_creator.employee.DTOs;

import java.util.List;

import com.cobaltspiral.employee_creator.employee.entity.Employee;

public record EmployeeResponseDTO(
    Long id,
    String firstName,
    String middleName,
    String lastName,
    String email,
    String mobileNumber,
    String address
) {

    public static EmployeeResponseDTO fromEntity(Employee employee) {
        return new EmployeeResponseDTO(
            employee.getId(),
            employee.getFirstName(),
            employee.getMiddleName(),
            employee.getLastName(),
            employee.getEmail(),
            employee.getMobileNumber(),
            employee.getAddress()
        );
    }

    public static List<EmployeeResponseDTO> fromEntity(List<Employee> employees) {
        return employees.stream()
            .map(EmployeeResponseDTO::fromEntity)
            .toList();
    }
}
