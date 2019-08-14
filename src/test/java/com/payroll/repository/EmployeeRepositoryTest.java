package com.payroll.repository;

import com.payroll.domain.User.Employee;
import com.payroll.factory.EmployeeFactory;
import com.payroll.repository.Interface.IEmployeeRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryTest {
    private IEmployeeRepository employeeRepository;

    @Before
    public void setUp() throws Exception
    {
        this.employeeRepository = EmployeeRepository.getRepository();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void create() {
        Employee e = EmployeeFactory.buildEmployee("Morne", "O'Connor", "1");
        Employee savedE = this.employeeRepository.create(e);
        System.out.println(savedE);
    }
    @Test
    public void read() {
        Object obj = this.employeeRepository.read("1");
        Assert.assertNotNull(obj);
    }

    @Test
    public void update()  {
        Employee obj = EmployeeFactory.buildEmployee("Morne","O'Connor","1");
        Assert.assertEquals("Morne", obj.getFirstName());
    }

    @Test
    public void delete(){
        boolean item = false;
        this.employeeRepository.delete("1");
        Set<Employee> obj = this.employeeRepository.getAll();
        if(obj.contains("1"))
        {
            item = true;
        }
        else
            item = false;
        assertFalse(item);
    }

}