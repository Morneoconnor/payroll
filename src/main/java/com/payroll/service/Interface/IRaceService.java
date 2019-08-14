package com.payroll.service.Interface;

import com.payroll.domain.User.Race;

import java.util.Set;

public interface IRaceService extends IService<Race,String> {
    Set<Race> getAll();
}
