package com.payroll.factory;

import com.payroll.domain.User.Employee;

public class EmployeeFactory {
    public static Employee buildEmployee(String firstName, String lastName, String id) {
        return new Employee.Builder().id(id)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
