package com.payroll.domain.User;

import java.util.Objects;
import java.util.Set;

public class Employee {
    private String firstName, lastName, id;

    private Employee()
    {

    }
    private Employee(Builder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public static class Builder {

        private String firstName, lastName, id;
        private Set<Employee> employee;

        public Builder firstName( String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName( String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Employee Id='" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

