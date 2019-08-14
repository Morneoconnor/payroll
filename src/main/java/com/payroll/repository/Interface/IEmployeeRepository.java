package com.payroll.repository.Interface;

import com.payroll.domain.User.Employee;

import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();

}
