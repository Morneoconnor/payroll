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
import com.payroll.service.EmployeeService;
import com.payroll.service.GenderService;
import com.payroll.service.Interface.IEmployeeService;
import com.payroll.service.Interface.IGenderService;
import com.payroll.service.Interface.IRaceService;
import com.payroll.service.RaceService;
import com.payroll.service.demographic.GenderDemoService;
import com.payroll.service.demographic.Interface.IGenderDemoService;
import com.payroll.service.demographic.Interface.IRaceDemoService;
import com.payroll.service.demographic.RaceDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
        @Autowired
        @Qualifier("ServiceImpl")
        private IEmployeeService employeeService = EmployeeService.getEmployeeService();
        private IGenderService employeeGenderService = GenderService.getGenderService();
        private IRaceService employeeRaceService = RaceService.getRaceService();
        private IRaceDemoService raceService = RaceDemoService.getGenderService();
        private IGenderDemoService genderService = GenderDemoService.getGenderService();

        @PostMapping("/create")
        @ResponseBody
        public Employee create(String firstName, String lastName, String id,int genderId, int raceId) {
                Employee employee = EmployeeFactory.buildEmployee(firstName, lastName, id);
                employeeService.create(employee);

                Gender employeeGender = GenderFactory.buildGender("Male", "1");
                employeeGenderService.create(employeeGender);

                Race employeeRace = RaceFactory.buildRace("White", "1");
                employeeRaceService.create(employeeRace);

                RaceDemo race = RaceDemoFactory.buildRace("White");
                raceService.create(race);

                GenderDemo gender = GenderDemoFactory.buildGender("Male");
                genderService.create(gender);

                return employee;
        }
}
