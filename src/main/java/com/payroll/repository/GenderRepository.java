package com.payroll.repository;

import com.payroll.domain.User.Gender;
import com.payroll.repository.Interface.IGenderRepository;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*;
import java.util.Set;

@Qualifier("GenInMemory")
public class GenderRepository implements IGenderRepository{
    private static GenderRepository repository = null;
    private Set<Gender> _gender;

    private GenderRepository() {
        this._gender = new HashSet<>();
    }

    public static IGenderRepository getRepository(){
        if(repository == null) repository = new GenderRepository();
        return repository;
    }

    @Override
    public Gender create(Gender gender){
        this._gender.add(gender);
        return gender;
    }

    @Override
    public Gender read(String id){
        return this._gender.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }
    @Override
    public Gender update(Gender gender) {
        Gender updateGender = null;
        this._gender.remove(gender.getId());
        this._gender.add(gender);
        updateGender = gender;
        return updateGender;
    }
    @Override
    public void delete(String id) {
        this._gender.remove(id);
    }

    @Override
    public Set<Gender> getAll(){
        Collection<Gender> gender = this._gender;
        Set<Gender> set = new HashSet<>();
        set.addAll(gender);
        return set;
    }
}
