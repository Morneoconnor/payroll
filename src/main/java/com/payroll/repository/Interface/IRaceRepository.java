package com.payroll.repository.Interface;

import com.payroll.domain.User.Race;

import java.util.Set;

public interface IRaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
