package com.payroll.repository.demographic;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.repository.demographic.Interface.IRaceDemoRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceDemoRepository implements IRaceDemoRepository{
    private static IRaceDemoRepository raceRepository = null;

    private Set<RaceDemo> genders;


    private RaceDemoRepository(){
        this.genders = new HashSet<>();
    }

    public static IRaceDemoRepository getRepository(){
        if (raceRepository == null) raceRepository = new RaceDemoRepository();
        return raceRepository;
    }

    @Override
    public RaceDemo create(RaceDemo gender) {
        this.genders.add(gender);
        return gender;
    }

    @Override
    public RaceDemo update(RaceDemo gender) {
        RaceDemo updatedGender = null;
        RaceDemo e = read(gender.getId());
        if (e != null){
            delete(gender.getId());
            this.genders.add(gender);
            updatedGender = gender;
        }
        return updatedGender;
    }

    @Override
    public void delete(String s) {
        RaceDemo e = read(s);
        if (e != null) {
            this.genders.remove(e);
        }
    }

    @Override
    public RaceDemo read(final String s) {
        return this.genders.stream().filter(e -> e.getId().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<RaceDemo> getAll() {
        return this.genders;
    }
}
