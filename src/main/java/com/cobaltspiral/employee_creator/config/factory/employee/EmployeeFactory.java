package com.cobaltspiral.employee_creator.config.factory.employee;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.cobaltspiral.employee_creator.employee.EmployeeRepository;
import com.cobaltspiral.employee_creator.employee.entity.Employee;

import com.github.javafaker.Faker;

@Component 
@Profile ({"dev", "test"})
public class EmployeeFactory {

    private final Faker faker = new Faker();
    private final EmployeeRepository repo;

    public EmployeeFactory(EmployeeRepository repo) {
        this.repo = repo;
    }
    
    public boolean repoEmpty() {
        return this.repo.count() == 0;
    }

    public Employee create() {
        var opts = EmployeeFactoryOptions.builder().build();
        return create(opts);
    }

    public Employee create(EmployeeFactoryOptions options) {
        Employee createdEmployee = new Employee();
        createdEmployee.setFirstName(faker.name().firstName());
        createdEmployee.setMiddleName(faker.name().nameWithMiddle());
        createdEmployee.setLastName(faker.name().lastName());
        createdEmployee.setEmail(faker.internet().emailAddress());
        createdEmployee.setMobileNumber(faker.phoneNumber().cellPhone().replaceAll("[^0-9]", ""));
        createdEmployee.setAddress(faker.address().fullAddress());
        this.repo.saveAndFlush(createdEmployee);
        return createdEmployee;
    }

    public List<Employee> create(EmployeeFactoryOptions options, int n) {
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Employee created = create(options);
            employees.add(created);
        }

        return employees;
    }

}