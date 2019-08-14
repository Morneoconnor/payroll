package com.payroll.repository;

import com.payroll.domain.User.Race;
import com.payroll.factory.RaceFactory;
import com.payroll.repository.Interface.IRaceRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryTest {
    private IRaceRepository raceRepository;
    @Before
    public void setUp() throws Exception {
        this.raceRepository = RaceRepository.getRepository();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        Race r = RaceFactory.buildRace("White",  "1");
        Race savedR = this.raceRepository.create(r);
        System.out.println(savedR);
    }
    @Test
    public void read() {
        Object obj = this.raceRepository.read("1");
        System.out.println(obj);
        Assert.assertNotNull(obj);
    }

    @Test
    public void update()  {
        Race obj = RaceFactory.buildRace("White","1");
        Assert.assertEquals("1", obj.getId());
    }

    @Test
    public void delete(){
        boolean item = false;
        this.raceRepository.delete("1");
        Set<Race> obj = this.raceRepository.getAll();
        if(obj.contains("1"))
        {
            item = true;
        }
        else
            item = false;
        assertFalse(item);
    }

}