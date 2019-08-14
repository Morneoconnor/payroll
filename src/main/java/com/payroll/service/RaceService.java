package com.payroll.service;

import com.payroll.domain.User.Race;
import com.payroll.repository.Interface.IRaceRepository;
import com.payroll.repository.RaceRepository;
import com.payroll.service.Interface.IRaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("RaceImpl")
public class RaceService  implements IRaceService {
    @Autowired
    @Qualifier("RaceInMemory")
    private IRaceRepository repository;
    private static IRaceService service = null;

    private RaceService(){
        this.repository = RaceRepository.getRepository();
    }

    public static IRaceService getRaceService(){
        if (service == null) service = new RaceService();
        return service;
    }


    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public Race read(String s) {
        return repository.read(s);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Set<Race> getAll() {
        Set<Race> race = this.repository.getAll();
        System.out.println("All in set gender" + race);
        return race;
    }
}
