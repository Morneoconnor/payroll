package com.payroll.factory.demographic;

import com.payroll.domain.demographic.GenderDemo;
import com.payroll.util.Misc;

public class GenderDemoFactory {
    public static GenderDemo buildGender(String gender){
        return new GenderDemo.Builder()
                .id(Misc.generateId())
                .description(gender)
                .build();
    }
}
