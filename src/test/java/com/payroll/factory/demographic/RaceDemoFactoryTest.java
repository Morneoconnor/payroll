package com.payroll.factory.demographic;

import com.payroll.domain.demographic.RaceDemo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceDemoFactoryTest {
    @Test
    public void buildRace() throws Exception {
        RaceDemo race = RaceDemoFactory.buildRace("White");
        Assert.assertEquals("White", race.getDescription());
        Assert.assertNotNull(race.getId());
        System.out.println(race.getId());
        Assert.assertNotNull(race);
    }

}