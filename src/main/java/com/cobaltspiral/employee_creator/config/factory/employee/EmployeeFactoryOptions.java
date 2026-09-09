package com.cobaltspiral.employee_creator.config.factory.employee;

public class EmployeeFactoryOptions {

    String firstName;
    String middleName;
    String lastName;
    String email;
    Integer mobileNumber;
    String address;

    private EmployeeFactoryOptions(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.mobileNumber = builder.mobileNumber;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private String email;
        private Integer mobileNumber;
        private String address;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder mobileNumber(Integer mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public EmployeeFactoryOptions build() {
            return new EmployeeFactoryOptions(this);
        }
    }
    
}