package com.cobaltspiral.employee_creator.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.cobaltspiral.employee_creator.config.factory.employee.EmployeeFactory;
import com.github.javafaker.Faker;

@Component
@Profile("dev")
public class DataSeeder implements CommandLineRunner {

    private final EmployeeFactory employeeFactory;
    private final Faker faker = new Faker();

    public DataSeeder(EmployeeFactory employeeFactory) {
        this.employeeFactory = employeeFactory;
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
