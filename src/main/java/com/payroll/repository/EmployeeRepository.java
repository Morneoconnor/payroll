package com.payroll.repository;

import com.payroll.domain.User.*;
import com.payroll.repository.Interface.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("EmpInMemory")
public class EmployeeRepository implements IEmployeeRepository {
    private static EmployeeRepository repository = null;
    private Set<Employee> _employee;

    private EmployeeRepository() {
        this._employee = new HashSet<>();
    }

    public static IEmployeeRepository getRepository(){
        if(repository == null) repository = new EmployeeRepository();
        return repository;
    }

    @Override
    public Employee create(Employee employee){
        this._employee.add(employee);
        return employee;
    }

    @Override
    public Employee read(String id){
        return this._employee.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        Employee updateEmployee = null;
        this._employee.remove(employee.getId());
        this._employee.add(employee);
        updateEmployee = employee;
        return updateEmployee;
    }

    public void delete(String id) {
        this._employee.remove(id);
    }

    public Set<Employee> getAll(){
        Collection<Employee> employee = this._employee;
        Set<Employee> set = new HashSet<>();
        set.addAll(employee);
        return set;
    }
}
