package com.payroll.service.demographic.Interface;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.service.Interface.IService;

import java.util.Set;

public interface IGenderDemoService extends IService<GenderDemo, String> {
    Set<GenderDemo> getAll();
}
