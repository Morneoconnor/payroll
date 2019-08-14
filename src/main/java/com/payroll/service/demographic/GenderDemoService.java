package com.payroll.service.demographic;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.repository.GenderRepository;
import com.payroll.repository.demographic.GenderDemoRepository;
import com.payroll.repository.demographic.Interface.IGenderDemoRepository;
import com.payroll.service.demographic.Interface.IGenderDemoService;

import java.util.Set;

public class GenderDemoService implements IGenderDemoService {
    private static IGenderDemoService service = null;
    private IGenderDemoRepository genderRepository;

    private GenderDemoService(){
        this.genderRepository = GenderDemoRepository.getRepository();
    }

    public static IGenderDemoService getGenderService(){
        if (service == null) service = new GenderDemoService();
        return service;
    }

    @Override
    public GenderDemo create(GenderDemo gender) {
        return this.genderRepository.create(gender);
    }

    @Override
    public GenderDemo update(GenderDemo gender) {
        return this.genderRepository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.genderRepository.delete(s);
    }

    @Override
    public GenderDemo read(String s) {
        return this.genderRepository.read(s);
    }

    @Override
    public Set<GenderDemo> getAll() {
        Set<GenderDemo> gender = this.genderRepository.getAll();
        System.out.println("In getall, all = " + gender);
        return gender;
    }

}

