package com.payroll.service.demographic;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.factory.demographic.RaceDemoFactory;
import com.payroll.repository.demographic.Interface.IRaceDemoRepository;
import com.payroll.repository.demographic.RaceDemoRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceDemoServiceTest {
    private IRaceDemoRepository repository;
    private RaceDemo race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceDemoRepository.getRepository();
        this.race = RaceDemoFactory.buildRace("White");
    }

    @Test
    public void getAll() {
        Set<RaceDemo> race = this.repository.getAll();
        System.out.println("all = " + race);
    }
}