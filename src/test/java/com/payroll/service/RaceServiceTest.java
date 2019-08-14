package com.payroll.service;

import com.payroll.domain.User.Race;
import com.payroll.factory.RaceFactory;
import com.payroll.repository.Interface.IRaceRepository;
import com.payroll.service.Interface.IRaceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceServiceTest {
    private IRaceRepository repository;
    private Race race;
    private IRaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceService.getRaceService();
    }

    @Test
    public void create() throws Exception {
        Race race = RaceFactory.buildRace("White", "1");
        service.create(race);
        Race readData = service.read(race.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void update() throws Exception {
        Race race = RaceFactory.buildRace("White", "1");
        service.create(race);
        Race readData = service.read(race.getId());

        service.update(race);

        Assert.assertEquals(race.getId(), readData.getId());
    }

    @Test
    public void read() throws Exception {
        Race race = RaceFactory.buildRace("White","1");
        service.create(race);
        Race readData = service.read(race.getId());

        Assert.assertNotNull(readData);
    }

    @Test
    public void delete() throws Exception {
        Race race = RaceFactory.buildRace("White","1");
        service.create(race);
        Race readData = service.read(race.getId());
        Assert.assertNotNull(readData);

        service.delete(readData.getId());
    }
    @Test
    public void getAll() {
        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

}