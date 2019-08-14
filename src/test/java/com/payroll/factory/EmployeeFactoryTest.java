package com.payroll.factory;

import com.payroll.domain.User.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {
    @Test
    public void buildEmployee() throws Exception {
        Employee employee = EmployeeFactory.buildEmployee("Morne","O'Connor","1");
        Assert.assertEquals("Morne",employee.getFirstName());
    }

}