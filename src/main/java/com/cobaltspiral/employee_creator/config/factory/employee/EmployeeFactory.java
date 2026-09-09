package com.cobaltspiral.employee_creator.config.factory.employee;

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
        Employee createdEmployee = new Employee();
        createdEmployee.setFirstName(faker.name().firstName());
        createdEmployee.setLastName(faker.name().lastName());
        createdEmployee.setEmail(faker.internet().emailAddress());
        this.repo.saveAndFlush(createdEmployee);
        return createdEmployee;
    }
}
