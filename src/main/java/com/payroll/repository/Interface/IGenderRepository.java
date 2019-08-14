package com.payroll.repository.Interface;

import com.payroll.domain.User.Gender;

import java.util.Set;

public interface IGenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
