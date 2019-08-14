package com.payroll.factory;

import com.payroll.domain.User.Race;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {
    @Test
    public void buildRace() throws Exception {
        Race race = RaceFactory.buildRace("White","1");
        Assert.assertEquals("1",race.getId());
    }
}