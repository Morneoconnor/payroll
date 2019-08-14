package com.payroll.service.Interface;

import com.payroll.domain.User.Gender;

import java.util.Set;

public interface IGenderService extends IService<Gender,String> {
    Set<Gender> getAll();
}
