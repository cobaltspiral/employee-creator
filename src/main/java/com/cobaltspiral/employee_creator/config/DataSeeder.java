package com.cobaltspiral.employee_creator.config;

import com.cobaltspiral.employee_creator.config.factory.employee.EmployeeFactory;
import com.cobaltspiral.employee_creator.config.factory.employee.EmployeeFactoryOptions;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

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
        
        if (employeeFactory.repoEmpty()) {
            int n = faker.random().nextInt(10, 20);
            EmployeeFactoryOptions options = EmployeeFactoryOptions.builder().build();
            for (int i = 0; i < n; i++) {
                employeeFactory.create(options);
            }
        }
    }
}
