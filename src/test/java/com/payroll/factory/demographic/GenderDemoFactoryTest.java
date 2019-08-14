package com.payroll.factory.demographic;

import com.payroll.domain.demographic.GenderDemo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderDemoFactoryTest {
    @Test
    public void buildGender() throws Exception {
        GenderDemo gender = GenderDemoFactory.buildGender("Male");
        Assert.assertEquals("Male", gender.getDescription());
        Assert.assertNotNull(gender.getId());
        System.out.println(gender.getId());
        Assert.assertNotNull(gender);
    }

}