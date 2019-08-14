package com.payroll.service.demographic;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.factory.demographic.GenderDemoFactory;
import com.payroll.repository.demographic.GenderDemoRepository;
import com.payroll.repository.demographic.Interface.IGenderDemoRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderDemoServiceTest {
    private IGenderDemoRepository repository;
    private GenderDemo gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderDemoRepository.getRepository();
        this.gender = GenderDemoFactory.buildGender("Male");
    }

    @Test
    public void getAll() {
        Set<GenderDemo> race = this.repository.getAll();
        System.out.println("all = " + race);
    }

}