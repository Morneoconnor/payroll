package com.payroll.repository;

import com.payroll.domain.User.Gender;
import com.payroll.factory.GenderFactory;
import com.payroll.repository.Interface.IGenderRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryTest {
    private IGenderRepository genderRepository;
    @Before
    public void setUp() throws Exception {
        this.genderRepository = GenderRepository.getRepository();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        Gender e = GenderFactory.buildGender("Male",  "1");
        Gender savedE = this.genderRepository.create(e);
        System.out.println(savedE);
    }
    @Test
    public void read() {
        Object obj = this.genderRepository.read("1");
        System.out.println(obj);
        Assert.assertNotNull(obj);
    }

    @Test
    public void update()  {
         Gender obj = GenderFactory.buildGender("Male","1");
        Assert.assertEquals("1", obj.getId());
    }

    @Test
    public void delete(){
        boolean item = false;
        this.genderRepository.delete("1");
        Set<Gender> obj = this.genderRepository.getAll();
        if(obj.contains("1"))
        {
            item = true;
        }
        else
            item = false;
        assertFalse(item);
    }

}