package com.payroll.service;

import com.payroll.domain.User.Employee;
import com.payroll.factory.EmployeeFactory;
import com.payroll.repository.Interface.IEmployeeRepository;
import com.payroll.service.Interface.IEmployeeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EmployeeServiceTest {
    private IEmployeeRepository repository;
    private Employee employee;
    private IEmployeeService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeService.getEmployeeService();
    }

    @Test
    public void create() throws Exception {
        Employee employee = EmployeeFactory.buildEmployee("Morne", "O'Connor", "1");
        service.create(employee);
        Employee readData = service.read(employee.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void update() throws Exception {
        Employee employee = EmployeeFactory.buildEmployee("Morne", "O'Connor", "1");
        service.create(employee);
        Employee readData = service.read(employee.getId());

        service.update(employee);

        Assert.assertEquals(employee.getId(), readData.getId());
    }

    @Test
    public void read() throws Exception {
        Employee employee = EmployeeFactory.buildEmployee("Morne", "O'Connor","1");
        service.create(employee);
        Employee readData = service.read(employee.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void delete() throws Exception {
        Employee employee = EmployeeFactory.buildEmployee("Morne", "O'Connor","1");
        service.create(employee);
        Employee readData = service.read(employee.getId());
        Assert.assertNotNull(readData);

        service.delete(readData.getId());
    }
    @Test
    public void getAll() {
        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

}