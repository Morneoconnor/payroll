package com.payroll.repository.demographic.Interface;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.repository.Interface.IRepository;

import java.util.Set;

public interface IRaceDemoRepository extends IRepository<RaceDemo, String> {
    Set<RaceDemo> getAll();
}