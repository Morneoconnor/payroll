package com.payroll.service;

import com.payroll.domain.User.Gender;
import com.payroll.repository.GenderRepository;
import com.payroll.repository.Interface.IGenderRepository;
import com.payroll.service.Interface.IGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("GenderImpl")
public class GenderService  implements IGenderService {
    @Autowired
    @Qualifier("GenInMemory")
    private IGenderRepository repository;
    private static IGenderService service = null;

    private GenderService(){
        this.repository = GenderRepository.getRepository();
    }

    public static IGenderService getGenderService(){
        if (service == null) service = new GenderService();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public Gender read(String s) {
        return repository.read(s);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Set<Gender> getAll() {
        Set<Gender> gender = this.repository.getAll();
        System.out.println("All in set gender" + gender);
        return gender;
    }
}
