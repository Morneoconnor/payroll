package com.payroll.factory;

import com.payroll.domain.User.Gender;

public class GenderFactory {
    public static Gender buildGender(String gender, String id) {
        return new Gender.Builder().gender(gender)
                .id(id)
                .build();
    }
}
