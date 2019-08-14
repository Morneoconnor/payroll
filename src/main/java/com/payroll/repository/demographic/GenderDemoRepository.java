package com.payroll.repository.demographic;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.repository.Interface.IGenderRepository;
import com.payroll.repository.demographic.Interface.IGenderDemoRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderDemoRepository implements IGenderDemoRepository{
    private static IGenderDemoRepository genderRepository = null;

    private Set<GenderDemo> genders;


    private GenderDemoRepository(){
        this.genders = new HashSet<>();
    }

    public static IGenderDemoRepository getRepository(){
        if (genderRepository == null) genderRepository = new GenderDemoRepository();
        return genderRepository;
    }

    @Override
    public GenderDemo create(GenderDemo gender) {
        this.genders.add(gender);
        return gender;
    }

    @Override
    public GenderDemo update(GenderDemo gender) {
        GenderDemo updatedGender = null;
        GenderDemo e = read(gender.getId());
        if (e != null){
            delete(gender.getId());
            this.genders.add(gender);
            updatedGender = gender;
        }
        return updatedGender;
    }

    @Override
    public void delete(String s) {
        GenderDemo e = read(s);
        if (e != null) {
            this.genders.remove(e);
        }
    }

    @Override
    public GenderDemo read(final String s) {
        return this.genders.stream().filter(e -> e.getId().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<GenderDemo> getAll() {
        return this.genders;
    }
}

