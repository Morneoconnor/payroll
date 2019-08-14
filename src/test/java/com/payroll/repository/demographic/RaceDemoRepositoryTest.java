package com.payroll.repository.demographic;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.factory.demographic.RaceDemoFactory;
import com.payroll.repository.demographic.Interface.IRaceDemoRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceDemoRepositoryTest {
    private IRaceDemoRepository raceRepository;
    private RaceDemo race;

    private RaceDemo getSavedGender(){
        Set<RaceDemo> savedGenders = this.raceRepository.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.raceRepository = RaceDemoRepository.getRepository();
        this.race = RaceDemoFactory.buildRace("White");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {
        RaceDemo employee = RaceDemoFactory.buildRace("White");
        raceRepository.create(employee);
        RaceDemo readData = raceRepository.read(employee.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void b_update() {
        RaceDemo employee = RaceDemoFactory.buildRace("White");
        raceRepository.create(employee);
        RaceDemo readData = raceRepository.read(employee.getId());
        employee.setDescription("Female");
        raceRepository.update(employee);

        Assert.assertEquals(employee.getDescription(), readData.getDescription());
    }

    @Test
    public void c_read() {
        RaceDemo employee = RaceDemoFactory.buildRace("White");
        raceRepository.create(employee);
        RaceDemo readData = raceRepository.read(employee.getId());

        Assert.assertNotNull(readData);
    }
    @Test
    public void e_delete() {
        RaceDemo employee = RaceDemoFactory.buildRace("White");
        raceRepository.create(employee);
        RaceDemo readData = raceRepository.read(employee.getId());
        Assert.assertNotNull(readData);
        raceRepository.delete(employee.getId());
        RaceDemo deleted = raceRepository.read(employee.getId());

        Assert.assertNull(deleted);
    }

    @Test
    public void d_getAll() {
        Set<RaceDemo> employeeSet = raceRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }
}