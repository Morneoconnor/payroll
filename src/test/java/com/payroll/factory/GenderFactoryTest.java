package com.payroll.factory;

import com.payroll.domain.User.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {
    @Test
    public void buildGender() throws Exception {
        Gender gender = GenderFactory.buildGender("Male","1");
        Assert.assertEquals("Male",gender.getGender());
        Assert.assertEquals("1",gender.getId());
    }

}