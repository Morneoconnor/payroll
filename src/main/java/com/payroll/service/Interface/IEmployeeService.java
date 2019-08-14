package com.payroll.service.Interface;

import com.payroll.domain.User.Employee;

import java.util.Set;

public interface IEmployeeService extends IService<Employee,String> {
    Set<Employee> getAll();
}
