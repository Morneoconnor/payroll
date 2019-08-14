package com.payroll.service.demographic;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.repository.demographic.Interface.IRaceDemoRepository;
import com.payroll.repository.demographic.RaceDemoRepository;
import com.payroll.service.demographic.Interface.IRaceDemoService;

import java.util.Set;

public class RaceDemoService implements  IRaceDemoService{
    private static IRaceDemoService service = null;
    private IRaceDemoRepository raceRepository;

    private RaceDemoService(){
        this.raceRepository = RaceDemoRepository.getRepository();
    }

    public static IRaceDemoService getGenderService(){
        if (service == null) service = new RaceDemoService();
        return service;
    }

    @Override
    public RaceDemo create(RaceDemo race) {
        return this.raceRepository.create(race);
    }

    @Override
    public RaceDemo update(RaceDemo race) {
        return this.raceRepository.update(race);
    }

    @Override
    public void delete(String s) {
        this.raceRepository.delete(s);
    }

    @Override
    public RaceDemo read(String s) {
        return this.raceRepository.read(s);
    }

    @Override
    public Set<RaceDemo> getAll() {
        Set<RaceDemo> race = this.raceRepository.getAll();
        System.out.println(" Set all = " + race);
        return race;
    }

}

