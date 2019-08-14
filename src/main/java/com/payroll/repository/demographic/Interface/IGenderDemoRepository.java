package com.payroll.repository.demographic.Interface;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.repository.Interface.IRepository;

import java.util.Set;

public interface IGenderDemoRepository extends IRepository<GenderDemo, String> {
    Set<GenderDemo> getAll();
}
