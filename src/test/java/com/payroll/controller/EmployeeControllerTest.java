package com.payroll.controller;

import com.payroll.domain.User.Employee;
import com.payroll.domain.User.Gender;
import com.payroll.domain.User.Race;
import com.payroll.domain.demographic.GenderDemo;
import com.payroll.domain.demographic.RaceDemo;
import com.payroll.factory.EmployeeFactory;
import com.payroll.factory.GenderFactory;
import com.payroll.factory.RaceFactory;
import com.payroll.factory.demographic.GenderDemoFactory;
import com.payroll.factory.demographic.RaceDemoFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeControllerTest {
    private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        GenderDemo gender = GenderDemoFactory.buildGender("Male");
        RaceDemo race = RaceDemoFactory.buildRace("White");
        Gender employeeGender = GenderFactory.buildGender("Male", "1");


        Race employeeRace = RaceFactory.buildRace("White", "1");
        Employee employee = EmployeeFactory.buildEmployee("Morne", "O'Connor" ,"1");
        employeeController.create("Morne", "O'Connor", "1",1, 1);

    }
}