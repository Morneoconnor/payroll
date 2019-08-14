package com.payroll.repository.demographic;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.factory.demographic.GenderDemoFactory;
import com.payroll.repository.demographic.Interface.IGenderDemoRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderDemoRepositoryTest {
    private IGenderDemoRepository genderRepository;
    private GenderDemo gender;

    private GenderDemo getSavedGender(){
        Set<GenderDemo> savedGenders = this.genderRepository.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.genderRepository = GenderDemoRepository.getRepository();
        this.gender = GenderDemoFactory.buildGender("Male");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {
        GenderDemo employee = GenderDemoFactory.buildGender("Male");
        genderRepository.create(employee);
        GenderDemo readData = genderRepository.read(employee.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void b_update() {
        GenderDemo employee = GenderDemoFactory.buildGender("Male");
        genderRepository.create(employee);
        GenderDemo readData = genderRepository.read(employee.getId());
        employee.setDescription("Female");
        genderRepository.update(employee);

        Assert.assertEquals(employee.getDescription(), readData.getDescription());
    }

    @Test
    public void c_read() {
        GenderDemo employee = GenderDemoFactory.buildGender("Male");
        genderRepository.create(employee);
        GenderDemo readData = genderRepository.read(employee.getId());

        Assert.assertNotNull(readData);
    }
    @Test
    public void e_delete() {
        GenderDemo employee = GenderDemoFactory.buildGender("Male");
        genderRepository.create(employee);
        GenderDemo readData = genderRepository.read(employee.getId());
        Assert.assertNotNull(readData);
        genderRepository.delete(employee.getId());
        GenderDemo deleted = genderRepository.read(employee.getId());

        Assert.assertNull(deleted);
    }

    @Test
    public void d_getAll() {
        Set<GenderDemo> employeeSet = genderRepository.getAll();

        Assert.assertNotNull(employeeSet);
    }
}