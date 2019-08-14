package com.payroll.service.demographic.Interface;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.service.Interface.IService;

import java.util.Set;

public interface IRaceDemoService extends IService<RaceDemo, String> {
    Set<RaceDemo> getAll();
}