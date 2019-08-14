package com.payroll.repository;

import com.payroll.domain.User.Race;
import com.payroll.repository.Interface.IRaceRepository;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*;

@Qualifier("RaceInMemory")
public class RaceRepository implements IRaceRepository{
    private static RaceRepository repository = null;
    private Set<Race> _race;

    private RaceRepository() {
        this._race = new HashSet<>();
    }

    public static IRaceRepository getRepository(){
        if(repository == null) repository = new RaceRepository();
        return repository;
    }
    @Override
    public Race create(Race race){
        this._race.add(race);
        return race;
    }
    @Override
    public Race read(String id){
        return this._race.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }
    @Override
    public Race update(Race race) {
        Race updateRace = null;
        this._race.remove(race.getId());
        this._race.add(race);
        updateRace = race;
        return updateRace;
    }
    @Override
    public void delete(String id) {
        this._race.remove(id);
    }

    public Set<Race> getAll(){
        Collection<Race> race = this._race;
        Set<Race> set = new HashSet<>();
        set.addAll(race);
        return set;
    }
}
