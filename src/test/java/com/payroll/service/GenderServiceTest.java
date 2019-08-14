package com.payroll.service;

import com.payroll.domain.User.Gender;
import com.payroll.factory.GenderFactory;
import com.payroll.repository.Interface.IGenderRepository;
import com.payroll.service.Interface.IGenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class GenderServiceTest {
    private IGenderRepository repository;
    private Gender gender;
    private IGenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderService.getGenderService();
    }

    @Test
    public void create() throws Exception {
        Gender gender = GenderFactory.buildGender("Male", "1");
        service.create(gender);
        Gender readData = service.read(gender.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void update() throws Exception {
        Gender gender = GenderFactory.buildGender("Male", "1");
        service.create(gender);
        Gender readData = service.read(gender.getId());

        service.update(gender);

        Assert.assertEquals(gender.getId(), readData.getId());
    }

    @Test
    public void read() throws Exception {
        Gender gender = GenderFactory.buildGender("Male","1");
        service.create(gender);
        Gender readData = service.read(gender.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void delete() throws Exception {
        Gender gender = GenderFactory.buildGender("Male","1");
        service.create(gender);
        Gender readData = service.read(gender.getId());
        Assert.assertNotNull(readData);

        service.delete(readData.getId());
    }
    @Test
    public void getAll() {
        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

}